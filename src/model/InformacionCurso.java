/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

import java.time.LocalTime;

public class InformacionCurso {
    private static long idCurso = 1000;
    private final long id;
    private String dias;
    private LocalTime hora;
    private int cantidadClases;
    private int horas_clase;
    private Curso curso;
    private Instructor instructor;

    public InformacionCurso() {
        this.id = ++idCurso;
    }
    
    public InformacionCurso(String dias, LocalTime hora, int cantidadClases, int horas_clase) {
        this.id = ++idCurso;
        this.dias = dias;
        this.hora = hora;
        this.cantidadClases = cantidadClases;
        this.horas_clase = horas_clase;
    }

    public InformacionCurso(String dias, LocalTime hora, int cantidadClases, int horas_clase, Curso curso, Instructor instructor) {
        this.id = ++idCurso;
        this.dias = dias;
        this.hora = hora;
        this.cantidadClases = cantidadClases;
        this.horas_clase = horas_clase;
        this.curso = curso;
        this.instructor = instructor;
    }
    
    public long getId() {
        return id;
    }  

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getCantidadClases() {
        return cantidadClases;
    }

    public void setCantidadClases(int cantidadClases) {
        this.cantidadClases = cantidadClases;
    }

    public int getHoras_clase() {
        return horas_clase;
    }

    public void setHoras_clase(int horas_clase) {
        this.horas_clase = horas_clase;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(id);
        sb.append("Dias del curso: ").append(dias);
        sb.append("Hora de impartición: ").append(hora);
        sb.append("Cantidad de clases: ").append(cantidadClases);
        sb.append("Horas por clase: ").append(horas_clase);
        sb.append("Curso: ").append(curso.getNombre());
        sb.append("Instructor: ").append(instructor.getNombre()).append(" ").append(instructor.getApellidos());        
        return sb.toString();
    }
    
    
    
    
    
        
    
    
    
    
}
