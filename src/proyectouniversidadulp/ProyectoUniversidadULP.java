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
import proyectouniversidadulp.modelo.Inscripcion;
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
            
           // Materia m = new Materia("Mecanografia", 1, true);
           // md.agregarMateria(m);
            

            Alumno a = ad.buscarAlumno(6);
            Materia m = md.buscarMateria(3);
            
            Inscripcion i = new Inscripcion(a, m);
            
            id.inscribirAlumno(i);
            
            System.out.println(id.obtenerMateriasCursadas(6));
            
//            Materia m =  md.buscarMateria(3);
//            Alumno a = new Alumno(999, "Juan", "Sanchez", LocalDate.of(2000,2, 24), true);
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
//            
//            ad.guardarAlumno(a);
//            id.inscribirAlumno(a, m);
//            id.agregarNota(a, m, 7);
//            
        } catch (ClassNotFoundException ex) {
            System.out.println("En el main"+ ex);
        }
    }
    
}
