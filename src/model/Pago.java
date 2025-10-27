
/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

import java.time.LocalDate;

public class Pago {
    private  static long idPago = 100;
    private final long id;
    private LocalDate fecha;
    private float costo;
    private float abono;
    private float adeudo;
    private String estado;
    private Asistencia asistencia;

    public Pago() {
        this.id = ++idPago;
    }

    public Pago(long id, LocalDate fecha, float costo, float abono, Asistencia asistencia) {
        this.id = id;
        this.fecha = fecha;
        this.costo = costo;
        setAbono(abono);
        this.asistencia = asistencia;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getAbono() {
        return abono;
    }

    private void setAbono(float abono) {
        this.abono = abono;        
        this.adeudo = this.costo - this.abono;
        
        if(this.adeudo>0){
            this.estado = "Pendiente";
        }else{
            this.estado = "Pagado";
        }
    }

    public Asistencia getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Asistencia asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clave de Pago: ").append(id).append("\n");
        sb.append("Curso:").append(asistencia.getCursoInscrito().getCurso().getCurso().getNombre()).append("\n");
        sb.append("Estudiante:").append(asistencia.getCursoInscrito().getEstudiante().getNombre())
                .append(" ").append(asistencia.getCursoInscrito().getEstudiante().getApellidos()).append("\n");
        sb.append("Fecha de Pago: ").append(fecha).append("\n");
        sb.append("Costo de Clase: ").append(costo).append("\n");
        sb.append("Abono: ").append(abono).append("\n");
        sb.append("Adeudo: ").append(adeudo).append("\n");
        sb.append("Estado de pago: ").append(estado).append("\n");    
        return sb.toString();
    }
    
    
    
    
    
}
