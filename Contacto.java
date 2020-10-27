/*
 * Desarrollar programa informatico para administrar una lista de contactos
 * implementando los siguientes conceptos:
 * - Lista dinamica
 * - Nodo
 * - Enlace
 */
package listas;

/**
 *
 * @author Isaac Peña
 */
public class Contacto {
    
    private int id;
    private String nombre;
    private String direccion;

    public Contacto() {
        
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public Contacto(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }   
}
