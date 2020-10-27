
package recursiva;


public class Recursiva1 {
    
    public void imprimir(int n) {
        
        if(n <= 10) {// Rango 
            System.out.print(n + " ");
            imprimir(n + 1); // Incremento al valor proporcionado
        } 
    } //1 2 3 4 5 6 7 8 9 10
}
    

