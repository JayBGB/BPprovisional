
package ejemploarearectangulo;

import java.util.Scanner;


public class EjemploAreaRectangulo {

    float resultado;
    
    public static void main(String[] args) {
        //Proyecto que calcula el área de un rectángulo de base = 2 y altura = 5
        
        float base, altura;
        
        Scanner objScanner = new Scanner(System.in);
         System.out.println("¡Bienvenid@! ¿Quieres calcular el área de un rectángulo? ");
         System.out.println("Introduce la base de tu rectángulo: ");
         base=objScanner.nextFloat();
         System.out.println("Ahora introduce su altura: ");
         altura=objScanner.nextFloat();
        
        float area= base* altura;
        
        System.out.println("El área de un rectángulo con base "+base+" y altura "+altura+" es "+area+".");
        
   
    }
    
}
