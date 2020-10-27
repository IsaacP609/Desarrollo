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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        String personas[] = new String[10];
        
        // Declaracion de objeto de la clase list
        List<String> personal = new ArrayList<>();
        
        // Agregar
        // Eliminar
        // Buscar
        personal.add("Luis");
        personal.add("Jose");
        personal.add("Mario");
        personal.add("Teodoro");
        
        for(String p : personal) {
            System.out.println(p);
        }
        
        // Las listas genericas funcionan solo con tipos de datos abstractos
        // No funcionan con tipos de datos primitivos o basicos
        
        */
        
        
        Scanner input = new Scanner(System.in);
        List<Contacto> listaContactos = new ArrayList <>();
        boolean seguir = false;
        
        int opc = 0;
        
        do {
            System.out.println("Id: ");
            int id = input.nextInt();
            
            System.out.println("Nombre: ");
            String nombre = input.next();
            
            System.out.println("Direccion: ");
            String direccion = input.next();
            
            listaContactos.add(new Contacto(id, nombre, direccion));
            
            // Rutina para preguntar si deseamos continuar con la captura de datos
            System.out.println("¿Agregar otro registro? 0->NO 1->SI");
            int opcion = input.nextInt();
            seguir = opcion == 1 ? true : false;
            
        }while(seguir);
        
        // Ciclo para imprimir la lista de los contactos  
        for(Contacto c : listaContactos) {
         
            System.out.printf("%-5s|%-20s|%-20s\n" , c.getId() , c.getNombre() , c.getDireccion());       
        }
    }
}
