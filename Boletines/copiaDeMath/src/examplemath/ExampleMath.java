
package examplemath;

import java.util.Scanner;


public class ExampleMath {

public static final double PI= 3.14;


    public static void main(String[] args) {
        //Declaración de una constante
        

        //Programa que calacule la longitud y el área de una circunferencia.
        System.out.println("¡Bienvenid@! ¿Quieres calcular el área de una circunferencia?");
        
        System.out.println("Introduce el radio:");
        float radio;
        Scanner object = new Scanner(System.in);
        radio=object.nextFloat();
        
        double longitud = PI*2*radio;
        float area = (float) (PI*Math.pow(radio, 2));
        
        System.out.println("La longitud es "+longitud+" y el área es "+area);
                
        
        
        
        
        
        
    }
    
}
