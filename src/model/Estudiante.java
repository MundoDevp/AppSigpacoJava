/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Estudiante extends Persona {
    private final long idMatricula = 50000;
    private final long matricula;
    private String estudios;

    public Estudiante( String nombre, String apellidos, String telefono, 
            String foto, String estudios) {
        super(nombre, apellidos, telefono, foto);
        this.matricula = idMatricula + id;
        this.estudios = estudios;
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

    public static int getIdPersona() {
        return idPersona;
    }

    public static void setIdPersona(int idPersona) {
        Persona.idPersona = idPersona;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        sb.append(super.toString());
        sb.append("Matricula: ").append(matricula).append("\n");
        sb.append("Estudios: ").append(estudios).append("\n");        
        return sb.toString();
    }

    

    
}
