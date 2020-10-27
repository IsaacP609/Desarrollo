
package arreglosll1;

import java.util.Scanner;

public class Arreglosll1 {

    private static int i;

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int numeros[] = new int[15];
        int suma_positivos = 0, suma_negativos = 0, media_positivos = 0, media_negativos = 0;
        int conteo_positivos = 0, conteo_negativos = 0;
        
        System.out.println("Guardando los numeros en el arreglo");
        for(int i = 0; i < 15; i++) {
            System.out.println((i+1) + ". Digite un numero");
            numeros[i] = sc.nextInt();
            
            if(numeros[i] > 0) {// Sumatoria y calculo de numeros positivos
                suma_positivos += numeros[i];
                conteo_positivos++;
            }
            else {// Sumatoria y calculo de numeros negativos
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }
        int mayor, menor;
        mayor = menor = numeros[i];
        
        for(int i = 1; i < numeros.length; i++) {
            if(numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if(numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        System.out.println("======================================================");
        System.out.println("Hay " + conteo_positivos + " numeros positivos");
        System.out.println("Hay " + conteo_negativos + " numeros negativos");
        System.out.println("La suma de los numeros positivos es: " + suma_positivos);
        System.out.println("La suma de los numeros negativos es: " + suma_negativos);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }  
}
