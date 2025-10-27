/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Configuracion {
    private static long idConfiguracion = 400;
    private final long id;    
    private String nombreInstituto;
    private String direccion;
    private String telefono;
    private String logo;
    private Administrador admin;

    public Configuracion() {
        this.id = ++idConfiguracion;
    }

    public Configuracion(String nombreInstituto, String direccion, String telefono, String logo) {
        this.id = ++idConfiguracion;
        this.nombreInstituto = nombreInstituto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
    }

    public Configuracion(String nombreInstituto, String direccion, String telefono, String logo, Administrador admin) {
        this.id = ++idConfiguracion;
        this.nombreInstituto = nombreInstituto;
        this.direccion = direccion;
        this.telefono = telefono;
        this.logo = logo;
        this.admin = admin;
    }

    public long getId() {
        return id;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Administrador getAdmin() {
        return admin;
    }

    public void setAdmin(Administrador admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();        
        sb.append("Instituto: ").append(nombreInstituto).append("\n");
        sb.append("Dirección: ").append(direccion).append("\n");
        sb.append("Teléfono: ").append(telefono).append("\n");
        sb.append("Logo: ").append(logo).append("\n");
        sb.append("Admin: ").append(admin.nombre).append(" ").append(admin.apellidos).append("\n");       
        return sb.toString();
    }
    
    
    
}
