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
import javax.swing.JOptionPane;
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
            JOptionPane.showMessageDialog(null, "Error al conectar " + ex);
        }
    
    }
    
    
    public void desactivarMateria(int id){
    String sql = "UPDATE materia SET activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al desactivar " + ex);
        }
    }
    
     public void activarMateria(int id){
    String sql = "UPDATE materia SET activo=? WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1,true);
            ps.setInt(2, id);
            ps.executeUpdate();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al activar " + ex);
        }
    }

    
    public void agregarMateria(Materia materia){
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
            JOptionPane.showMessageDialog(null, "Error al insertar el registro " + ex);
        }
    }
    
    public void actualizarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=?,anio=? WHERE idMateria=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3, materia.getIdMateria());
            ps.executeUpdate();
            
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            
        }catch(SQLException ex){
            System.out.println("Error al intentar modificar registro" + ex);
        }
        
    }
    
    public List<Materia> obtenerMateria(boolean bol) {
        List<Materia> materias = new ArrayList<>();
        Materia materia = null;
        String sql;
        
        if(bol){
            sql = "SELECT * FROM materia WHERE activo=true ORDER BY nombre ASC;";
        }else{
            sql = "SELECT * FROM materia WHERE activo=false ORDER BY nombre ASC;";
        }     
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
    
    
    public List<Materia> obtenerMateria(){
        List<Materia> materias = new ArrayList<>();
        Materia materia = null;
        
        String sql = "SELECT * FROM materia ORDER BY nombre ASC;";
        
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
