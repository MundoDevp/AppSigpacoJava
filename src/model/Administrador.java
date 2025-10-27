
/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Administrador extends Persona{  

    public Administrador(String nombre, String apellidos, String telefono, String foto) {
        super(nombre, apellidos, telefono, foto);
        
    }

    public int getId() {
        return id;
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
        return sb.toString();
    }
    
    
    
    
    
}
