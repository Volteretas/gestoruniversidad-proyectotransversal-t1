/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import proyectouniversidadulp.modelo.*;
import proyectouniversidadulp.modelo.Conexion;

/**
 *
 * @author Admin
 */
public class AlumnoData {
    private Connection con;

    public AlumnoData(Conexion conexion) {
       
     
        try {
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
   
    
    }
    
    public void desactivarAlumno(int id){
    String sql = "UPDATE alumno SET activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Se desactivo correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al desacticar");
            System.out.println("Error al desactivar "+ex);
        }
    }
    
     public void activarAlumno(int id){
    String sql = "UPDATE alumno SET activo=? WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1,true);
            ps.setInt(2, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Se activo correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al activar");
            System.out.println("Error al activar "+ex);
        }
    }

    
    public void agregarAlumno(Alumno alumno){
        String sql = "INSERT INTO alumno (legajo, nombre, apellido ,fechNac, activo) VALUES (?,?,?,?,?)";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getLegajo());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getFechNac()));
            ps.setBoolean(5, alumno.isActivo());
            
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys(); //reculepro el idAlumno
            if (rs.next()){
             alumno.setIdAlumno(rs.getInt(1));
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Se agrego correctamente");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al insertar " + ex);
            System.out.println("Error al insertar "+ex);
        }
        
    
    }
    
    
    public void actualizarAlumno(Alumno alumno){
        String sql = "UPDATE alumno SET legajo=?, nombre=?, apellido=? ,fechNac=? WHERE idAlumno=?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getLegajo());
            ps.setString(2, alumno.getNombre());
            ps.setString(3, alumno.getApellido());
            ps.setDate(4, Date.valueOf(alumno.getFechNac()));//LocalDate a Date
            ps.setInt(5,alumno.getIdAlumno() );
            ps.executeUpdate();
            
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Se actualizo correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al modificar " + ex);
            System.out.println("Error al modificar "+ex);
        }
        
    
    }
    
    public List<Alumno> obtenerAlumnos(){
    List<Alumno> alumnos= new ArrayList<>();
        
    Alumno alumno=null;
    
    String sql="SELECT * FROM alumno";
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
                       
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setLegajo(rs.getInt(2));
                alumno.setNombre(rs.getString(3));
                alumno.setApellido(rs.getString(4));
                alumno.setFechNac(rs.getDate(5).toLocalDate());  //date a LocalDate
                alumno.setActivo(rs.getBoolean(6));
                alumnos.add(alumno);
            }          
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar ");
        }    
       return alumnos;    
       
    }
    
    public List<Alumno> obtenerAlumnos(boolean bol){
    List<Alumno> alumnos= new ArrayList<>();
        
    Alumno alumno=null;
    String sql;
    if(bol){
        sql="SELECT * FROM alumno WHERE activo=true";
    }else{
        sql="SELECT * FROM alumno WHERE activo=false";
    }
    
    
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
                       
            ResultSet rs =ps.executeQuery();
            while (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setLegajo(rs.getInt(2));
                alumno.setNombre(rs.getString(3));
                alumno.setApellido(rs.getString(4));
                alumno.setFechNac(rs.getDate(5).toLocalDate());  //date a LocalDate
                alumno.setActivo(rs.getBoolean(6));
                alumnos.add(alumno);
            }          
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al buscar ");
        }    
       return alumnos;    
       
    }
    
    public Alumno buscarAlumno(int id){
    Alumno alumno=null;
    
    String sql="SELECT * FROM alumno WHERE idAlumno=?";
    
      try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs =ps.executeQuery();
            if (rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setLegajo(rs.getInt(2));
                alumno.setNombre(rs.getString(3));
                alumno.setApellido(rs.getString(4));
                alumno.setFechNac(rs.getDate(5).toLocalDate());  //date a LocalDate
                alumno.setActivo(rs.getBoolean(6));
            }
 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar " + ex);
            System.out.println("Error al buscar " + ex);
        }     
       return alumno;   
    }
    
    public boolean existeAlumno(int id){
        String sql="SELECT * FROM alumno WHERE idAlumno=?;";
        boolean existe = false;
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                if(rs.getString("nombre") == null){
                existe = false;
            }else{
                existe = true;
            }
            }
            
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al comprobar " + ex);
        }
        return existe;
    }
}
