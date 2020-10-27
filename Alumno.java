/*
 * Desarrollar aplicacion para almacenar una lista de alumnos
 * El programa debe implementar el concepto de lista enlazada
 * Explicar mediante comentarios de codigo los conceptos de Lista, nodo y enlace.
 */
package listaalumnos;

/**
 *
 * @author Isaac Peña
 */
public class Alumno {
    
    private int id;
    private String nombre;
    private String direccion;

    public Alumno(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
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
}


