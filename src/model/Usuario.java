/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Usuario {
    private static int idContador = 100;
    private final int id;
    private String email;
    private String contrasenia;
    private Persona persona;
    private Rol rol;

    public Usuario() {
        this.id = ++idContador;
    }
    
    public Usuario(String email, String contrasenia) {
        this.id = ++idContador;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public Usuario(String email, String contrasenia, Persona persona, Rol rol) {
        this.id = ++idContador;
        this.email = email;
        this.contrasenia = contrasenia;
        this.persona = persona;
        this.rol = rol;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Id: ").append(id).append("\n");
        sb.append("Correo: ").append(email).append("\n");
        sb.append(persona).append("\n");
        sb.append("Rol: ").append(rol).append("\n");       
        return sb.toString();
    }

    
    
    
    
    
    
}
