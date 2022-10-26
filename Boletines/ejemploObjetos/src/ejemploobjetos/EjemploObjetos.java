
package ejemploobjetos;

import java.util.Scanner;


public class EjemploObjetos {

    
    public static void main(String[] args) {
        
        Rectangulo objRec1 = new Rectangulo();
        float resultado = objRec1.calcularArea(5f, 8f);
        System.out.println("Área = "+resultado);
        objRec1.calcularPerimetro(5f, 8f);
        
        //instancio objeto tipo rectángulo con con el constructor parametrizado
        
        Rectangulo objRec2 = new Rectangulo(5, 8);
        float base = objRec2.getBase();
        float altura = objRec2.devolverAltura();
        
        float re=objRec2.calcularArea(base, altura);
        
        System.out.println(" nuevo área = "+re);
        
        
        
      
        
        
        
        
        
        
        
        
    }
    
}
