/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

import java.time.LocalDate;

public class Asistencia {
    private static long idAsistencia = 2000;
    private final long id;
    private LocalDate fecha;
    private Inscripcion cursoInscrito;
    private String tipoAsistencia;// Presente, Grabacion

    
    public Asistencia(LocalDate fecha, Inscripcion cursoInscrito, String tipoAsistencia) {
        this.id = ++idAsistencia;
        this.fecha = fecha;
        this.cursoInscrito = cursoInscrito;
        this.tipoAsistencia = tipoAsistencia;
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

    public Inscripcion getCursoInscrito() {
        return cursoInscrito;
    }

    public void setCursoInscrito(Inscripcion cursoInscrito) {
        this.cursoInscrito = cursoInscrito;
    }

    public String getTipoAsistencia() {
        return tipoAsistencia;
    }

    public void setTipoAsistencia(String tipoAsistencia) {
        this.tipoAsistencia = tipoAsistencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Clave: ").append(id).append("\n");
        sb.append("Fecha: ").append(fecha).append("\n");
        sb.append("Curso: ").append(cursoInscrito.getCurso()).append("\n");
        sb.append("Estado: ").append(tipoAsistencia).append("\n");
       
        return sb.toString();
    }
    
    
    
    
    
    
    
    
}
