/*
 * Desarrollar aplicacion para almacenar una lista de alumnos
 * El programa debe implementar el concepto de lista enlazada
 * Explicar mediante comentarios de codigo los conceptos de lista, nodo y enlace.
 */
package listaalumnos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Isaac Peña
 */
public class ListaAlumnos {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        List<Alumno> listaAlumnos = new ArrayList<>();
        boolean seguir = false;
        
        do{
            
            System.out.println("ID");
            int id = input.nextInt();
            
            System.out.println("Nombre: ");
            String nombre = input.next();
            
            System.out.println("Dirección");
            String direccion = input.next();
            
            listaAlumnos.add(new Alumno(id, nombre, direccion));
            
            // Rutina para preguntar si deseamos continuar con la captura de datos
            System.out.println("¿Agregar otro registro? 0->NO; 1->Sí");
            /* Se le pregunta al usuario si desea agregar otro registro
            *  Si la respuesna es 1, se generara una nueva lista de nodos
            */
            int opcion = input.nextInt();
            seguir = opcion == 1 ? true : false;
            
        }while(seguir);
               
        // Ciclo para imprimir la lista de los alumnos
        System.out.printf("%-5s|%-20s|%-20s", "ID", "NOMBRE", "DIRECCIÓN\n");
        for(Alumno c : listaAlumnos){
                       
            System.out.printf("%-5s|%-20s|%-20s", c.getId(), c.getNombre(), c.getDireccion());
            // Esta es una lista de enlace simple con tres nodos, id, nombre y direccion
        }  
    }
}
