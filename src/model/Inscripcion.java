/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

import java.time.LocalDate;

public class Inscripcion {
    private static long idInscripcion = 1000;
    private long id;
    private LocalDate fecha;
    private Estudiante estudiante;
    private InformacionCurso curso;

    public Inscripcion() {
        this.id = ++idInscripcion;
    }
    
    public Inscripcion(LocalDate fecha, Estudiante estudiante, InformacionCurso curso) {
        this.fecha = fecha;
        this.estudiante = estudiante;
        this.curso = curso;
    }

    public long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public InformacionCurso getCurso() {
        return curso;
    }

    public void setCurso(InformacionCurso curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Clave: ").append(id);
        sb.append("Fecha de Inscripción: ").append(fecha);
        sb.append("Estudiante: ").append(estudiante);
        sb.append("Curso: ").append(curso.getCurso().getNombre());        
        return sb.toString();
    }
    
    
    
        
    
    
}
