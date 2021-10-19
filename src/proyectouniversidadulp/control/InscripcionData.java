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
import org.mariadb.jdbc.internal.util.dao.PrepareResult;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Inscripcion;
import proyectouniversidadulp.modelo.Materia;


/**
 *
 * @author Santiago
 */
public class InscripcionData {
    private Connection con;
    private Conexion conexion;
    
    public InscripcionData(Conexion conexion) {
        try {
            this.conexion = conexion;
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    }
    
    public void inscribirAlumno(Inscripcion ins){
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria) VALUES (?,?)";
        if(ins.getAlumno().isActivo() && ins.getMateria().isActivo()){
           try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, ins.getAlumno().getIdAlumno());
                ps.setInt(2, ins.getMateria().getIdMateria());
            
                ps.executeUpdate();
                ps.close();
            
                JOptionPane.showMessageDialog(null, "Se inscribio correctamente");
            }catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al inscribir");
                System.out.println("Error al inscribir " + ex);
            } 
        }else{
            System.out.println("No se puede inscribir alumno/materia no activa");
        }  
    }
    
    public void desinscribirAlumno (Inscripcion ins){
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ins.getAlumno().getIdAlumno());
            ps.setInt(2, ins.getMateria().getIdMateria());
            
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "Se desinscribio correctamente");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al desinscribir");
            System.out.println("Error al des-inscribir alumno " + ex);
        }
                
    }
    
    public void agregarNota (Inscripcion insc, double nota){
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria =?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al agregar nota" + ex);
        }
    }
    
    public List obtenerAlumnosMateria(int idMat){
        String sql="SELECT a.idAlumno, a.legajo, a.nombre, a.apellido, a.fechNac, a.activo FROM alumno a, inscripcion i WHERE i.idMateria = ? AND i.idAlumno = a.idAlumno; ";
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno=null;
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, idMat);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setLegajo(rs.getInt(2));
                alumno.setNombre(rs.getString(3));
                alumno.setApellido(rs.getString(4));
                alumno.setFechNac(rs.getDate(5).toLocalDate());
                alumno.setActivo(rs.getBoolean(6));
                alumnos.add(alumno);
            }
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al obtener alumnos " + ex);
        }
        
        return alumnos;
        
    }
    
    public List obtenerInscripciones() {
        String sql="SELECT * FROM inscripcion ORDER BY idAlumno ASC;";
        List<Inscripcion> inscripciones = new ArrayList<>();
        Inscripcion inscripcion=null;
        
        AlumnoData ad = new AlumnoData(conexion);
        MateriaData md = new MateriaData(conexion);
        try{
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            while(rs.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInsc(rs.getInt("idInsc"));
                inscripcion.setAlumno(ad.buscarAlumno(rs.getInt("idAlumno")));
                inscripcion.setMateria(md.buscarMateria(rs.getInt("idMateria")));
                inscripcion.setNota(rs.getInt("nota"));
                inscripciones.add(inscripcion);
            }
            
        }catch(SQLException ex){
            System.out.println("Error al obtener inscripciones " + ex);
        }
        return inscripciones;
    }
    
   public List obtenerMateriasCursadas(int idAlumno){
       String sql="SELECT m.idMateria,m.nombre, m.anio, m.activo FROM inscripcion i, materia m WHERE i.idAlumno = ? AND i.idMateria = m.idMateria;";
       List<Materia> materias = new ArrayList<>();
       Materia materia = null;
       
       try{
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setInt(1, idAlumno);
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
           System.out.println("Error al obtener materias " + ex);
       }
       return materias;
   }
   
   public List obtenerMateriasNoCursadas(int idAlumno){
       String sql="SELECT * FROM materia WHERE activo = 1 AND idMateria NOT IN (SELECT idMateria FROM inscripcion WHERE idAlumno = ? AND activo = 1);";
       List<Materia> materias = new ArrayList<>();
       Materia materia = null;
       
       try{
           PreparedStatement ps= con.prepareStatement(sql);
           ps.setInt(1, idAlumno);
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
           System.out.println("Error al obtener materias " + ex);
       }
       return materias;
   }
    
    //asdfasdf
}
