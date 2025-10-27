/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Instructor extends Persona{
    private static  long idMatricula = 50000;
    private final long matricula;
    private String estudios;

    public Instructor( String nombre, String apellidos, String telefono, String foto,long matricula, String estudios) {
        super(nombre, apellidos, telefono, foto);
        this.estudios = estudios;
        this.matricula = idMatricula + id;
    }

    public long getMatricula() {
        return matricula;
    }
    
    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }   

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Matricula: ").append(matricula);
        sb.append("Estudios: ").append(estudios);        
        return sb.toString();
    }

   
    
    
    
    
    
}
