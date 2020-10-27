/*
 * Desarrollar aplicacion para controlar pedidos de un establecimiento de comida
 * con los siguientes productos:
 * - Hamburguesas
 * - Papas fritas
 * - Refrescos
 * - Aros de cebolla
 * - Cerveza 
 */
package establecimientocomida;

import java.util.Scanner;
/**
 *
 * @author Isaac Peña
 */
public class EstablecimientoComida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int id = 0;
        int num = 0;
        int Opc = 0;
        double precio = 0;
        
        
    //MENU
    System.out.println("========================= MENU =======================");
    System.out.println("     1.  Hamburguesas                                 ");
    System.out.println("     2.  Papas fritas                                 ");
    System.out.println("     3.  Refrescos                                    ");
    System.out.println("     4.  Aros de cebolla                              ");
    System.out.println("     5.  Cerveza                                      ");
    System.out.println("======================================================");
    
    System.out.println("");
    System.out.println("Selecciona una opcion");//Funcion de opciones - Variable Opc
    Opc = sc.nextInt();
    
    if (Opc == 1) {//1. Hamburguesas
    System.out.println("Has elegido Hamburguesas\n");
    System.out.println("¿Cuantas hamburguesas deseas ordenar?");
    num = sc.nextInt();
    
    precio = (45.00 * num);
    id = 1;
    System.out.println("======== Tu orden ========");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", "ID", "DESCRIPCION", "CANTIDAD", "PRECIO");
    System.out.println("");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", id, " Hamburguesa(s) ", num , precio);
    }
    
    if (Opc == 2) {//2. Papas fritas
    System.out.println("Has elegido Papas fritas\n");
    System.out.println("¿Cuantas porciones de papas fritas deseas ordenar?");
    num = sc.nextInt();
    
    precio = (30.00 * num);
    id = 2;
    System.out.println("======== Tu orden ========");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", "ID", "DESCRIPCION", "CANTIDAD", "PRECIO");
    System.out.println("");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", id, " Porcion(es) de papas fritas ", num , precio);
    }
    
    if (Opc == 3) {//3. Refrescos
    System.out.println("Has elegido Refrescos\n");
    System.out.println("¿Cuantos refrescos deseas ordenar?");
    num = sc.nextInt();
    
    precio = (23.00 * num);
    id = 3;
    System.out.println("======== Tu orden ========");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", "ID", "DESCRIPCION", "CANTIDAD", "PRECIO");
    System.out.println("");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", id, " Refresco(s) ", num , precio);
    }
    
    if (Opc == 4) {//4. Aros de cebolla
    System.out.println("Has elegido Aros de cebolla\n");
    System.out.println("¿Cuantas porciones de aros de cebolla deseas ordenar?");
    num = sc.nextInt();
    
    precio = (28.00 * num);
    id = 4;
    System.out.println("======== Tu orden ========");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", "ID", "DESCRIPCION", "CANTIDAD", "PRECIO");
    System.out.println("");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", id, " Porcion(es) de aros de cebolla ", num , precio);
    }
    
    if (Opc == 5) {//5. Cerveza
    System.out.println("Has elegido Cerveza\n");
    System.out.println("¿Cuantas cervezas deseas ordenar?");
    num = sc.nextInt();
    
    precio = (33.00 * num);
    id = 5;
    System.out.println("======== Tu orden ========");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", "ID", "DESCRIPCION", "CANTIDAD", "PRECIO");
    System.out.println("");
    System.out.printf("%-5s|%-20s|%-20s|%-20s", id, " Cerveza(s) ", num , precio);
    }
    }
    
}
