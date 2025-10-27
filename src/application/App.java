/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package application;
import model.Administrador;
import model.Rol;
import model.Usuario;
public class App {
    public static void main(String[] args) {
        
        /**
         * Prueba de creacion de roles
         */
        Rol admin = new Rol("Administrador");
        Rol instructor = new Rol("Instructor");
        Rol estudiante = new Rol("Estudiante");
        
        System.out.println(admin);
        System.out.println(instructor);
        System.out.println(estudiante);
        
        /**
         * Prueba de Herencia con Administrador y persona                
        */
        Administrador administrador = new Administrador("Miguel", "Zavaleta", "+522251036155", "miguel.jpg");
        Administrador administrador2 = new Administrador("Rosario", "Villegas", "+522821125305", "rosario.jpg");
        System.out.println(administrador);
        System.out.println(administrador2);
        
        /**
         * Prueba de usuario con su relacion con rol admin y persona administrador
         */
        Usuario userAdmin = new Usuario("admin@mundodevp.com", "1234569", administrador, admin);
        System.out.println(userAdmin);
    }
    
}
