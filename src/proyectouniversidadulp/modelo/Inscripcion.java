/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectouniversidadulp.modelo;

/**
 *
 * @author Admin
 */
public class Inscripcion {
    private int idInsc;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion(int idInsc, Alumno alumno, Materia materia) {
        this.idInsc = idInsc;
        this.alumno = alumno;
        this.materia = materia;
    }
    
    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion() {
    }

    public int getIdInsc() {
        return idInsc;
    }

    public void setIdInsc(int idInsc) {
        this.idInsc = idInsc;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Inscripcion{" + "idInsc=" + idInsc + ", alumno=" + alumno.getNombre() + ", materia=" + materia.getNombre() + ", nota=" + nota + '}';
    }
    
    
    
    
}
