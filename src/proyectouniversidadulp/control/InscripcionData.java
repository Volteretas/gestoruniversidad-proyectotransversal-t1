/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import org.mariadb.jdbc.internal.util.dao.PrepareResult;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Materia;

/**
 *
 * @author Santiago
 */
public class InscripcionData {
    private Connection con;
    
    public InscripcionData(Conexion conexion) {
        try {
            con = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error en la conexion ");
        }
    }
    
    public void inscribirAlumno(Alumno alum, Materia mat){
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria) VALUES (?,?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alum.getIdAlumno());
            ps.setInt(2, mat.getIdMateria());
            
            ps.executeUpdate();
            ps.close();
        }catch (SQLException ex){
            System.out.println("Error al inscribir " + ex);
        }
    }
    
    public void desinscribirAlumno (Alumno alum, Materia mat){
        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, alum.getIdAlumno());
            ps.setInt(2, mat.getIdMateria());
            
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al des-inscribir alumno " + ex);
        }
                
    }
    
    public void agregarNota (Alumno alum, Materia mat, double nota){
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria =?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, alum.getIdAlumno());
            ps.setInt(3, mat.getIdMateria());
            ps.executeUpdate();
            ps.close();
        }catch(SQLException ex){
            System.out.println("Error al agregar nota" + ex);
        }
    }
    
    
}
