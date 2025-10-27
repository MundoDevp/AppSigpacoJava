/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Persona {
    protected static int idPersona=0;
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected String telefono;
    protected String foto;

    public Persona(String nombre, String apellidos, String telefono, String foto) {
        this.id = ++idPersona;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.foto = foto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();         
        sb.append("Nombre: ").append(nombre).append(" ").append(apellidos).append("\n");
        sb.append("Teléfono: ").append(telefono).append("\n");
        sb.append("Foto: ").append(foto).append("\n");
        
        return sb.toString();
    }

    
    
    
    
    
}
