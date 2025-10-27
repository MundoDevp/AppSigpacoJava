/**
 * @author mundodevp
 * Miguel Angel Zavaleta Esquivel
 */
package model;

public class Rol {
    private static int contadorId = 0;
    private int id;
    private String nombre;

    public Rol(){
         this.id = ++contadorId;        
    }
    public Rol(String nombre) {    
        this.id = ++contadorId; 
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }
    
    

    @Override
    public String toString() {
        return "Rol: " + nombre;
    }
    
        
    
    
}
