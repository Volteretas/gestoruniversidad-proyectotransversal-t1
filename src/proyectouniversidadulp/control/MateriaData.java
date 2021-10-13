/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import proyectouniversidadulp.modelo.*;
import proyectouniversidadulp.modelo.Conexion;
/**
 *
 * @author Santiago
 */
public class MateriaData {
    private Connection con;
    
    public MateriaData(Conexion conexion){
        
        try {
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    
    }
    
    public void guardarMateria(Materia materia){
        String sql = "INSERT INTO materia ( nombre, anio, activo) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                materia.setIdMateria(rs.getInt("idMateria"));
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al insertar el registro" + ex);
        }
    }
    
    public boolean actualizarMateria(Materia materia) {
        boolean actualizada = true;
        String sql = "UPDATE materia SET nombre=?,anio=?<activo=? WHERE idMateria=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            ps.executeUpdate();
            
            ps.close();
        }catch(SQLException ex){
            actualizada = false;
            System.out.println("Error al intentar modificar registro" + ex);
        }
        
        return actualizada;
    }
    
    public List<Materia> obtenerMateria() {
        return obtenerMateria("");
    }
    
    public List<Materia> obtenerMateria (String string){
        List<Materia> materias = new ArrayList<>();
        Materia materia = null;
        
        String sql = "SELECT * FROM materia WHERE nombre LIKE '%" + string + "%'";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("activo"));
                
                materias.add(materia);
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al buscar registros");
        }
        return materias;
    }
    
    public Materia buscarMateria(int idMateria){
        Materia materia = null;
        
        String sql = "SELECT * FROM materia WHERE idMateria=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(rs.getBoolean("activo"));
            }
        }catch (SQLException ex) {
            System.out.println("Error al buscar materia");
        }
        return materia;
    }
    
}
