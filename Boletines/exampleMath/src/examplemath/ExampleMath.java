
package examplemath;

import java.util.Scanner;


public class ExampleMath {


    public static void main(String[] args) {
        //Programa que calacule la longitud y el área de una circunferencia.
        System.out.println("¡Bienvenid@! ¿Quieres calcular el área de una circunferencia?");
        
        System.out.println("Introduce el radio:");
        float radio;
        Scanner object = new Scanner(System.in);
        radio=object.nextFloat();
        
        double longitud = Math.PI*2*radio;
        float area = (float) (Math.PI*Math.pow(radio, 2));
        
        System.out.println("La longitud es "+longitud+" y el área es "+area);
                
        
        
        
        
        
        
    }
    
}
