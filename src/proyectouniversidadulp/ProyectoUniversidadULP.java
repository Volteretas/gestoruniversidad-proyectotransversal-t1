/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectouniversidadulp.control.AlumnoData;
import proyectouniversidadulp.control.InscripcionData;
import proyectouniversidadulp.control.MateriaData;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Materia;

/**
 *
 * @author Admin
 */
public class ProyectoUniversidadULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Conexion conexion= new Conexion();
            AlumnoData ad = new AlumnoData(conexion);
            MateriaData md = new MateriaData(conexion);
            InscripcionData id = new InscripcionData(conexion);
            
            Materia m =  md.buscarMateria(3);
            Alumno a = ad.buscarAlumno(7);
//            
//            //ad.guardarAlumno(a);
//            
//            System.out.println("Alumno :"+ad.buscarAlumno(1));
//            
//            for(Alumno a1:ad.obtenerAlumnos()){
//               
//                System.out.println(a1);
//            
//            }
//            
//            //md.guardarMateria(m);
//            
//            id.inscribirAlumno(ad.buscarAlumno(6), md.buscarMateria(2));
//            id.inscribirAlumno(ad.buscarAlumno(7), md.buscarMateria(3));
//            
//            id.desinscribirAlumno(ad.buscarAlumno(7), md.buscarMateria(3));
            
            id.agregarNota(a, m, 10);
            
        } catch (ClassNotFoundException ex) {
            System.out.println("En el main"+ ex);
        }
    }
    
}
