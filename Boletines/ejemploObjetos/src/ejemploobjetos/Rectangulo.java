
package ejemploobjetos;

import java.io.InputStream;


public class Rectangulo {
    
    //declaro atributos
    
    private float base;
    private float altura;
    
    //constructores
    public Rectangulo (float ba, float alt){ //constructor parametrizado
    
        base=ba;
        altura=alt;
    
    }
    
    
    public Rectangulo(){ //constructor por defecto
    
    }

 
    
   //métodos de acceso - getters & setters
    
    public void darAltura(float al){   //corresponde a setAltura)
                
        altura = al;
    
    }
    
    public float devolverAltura(){ //corresponde a getAltura
    
        return altura;
    }
    
    public void setBase(float b){
    
        base = b;
    }
    
    public float getBase (){
    
        return base;
    }
    
    
    //defino metodos
    public float calcularArea (float b, float alt){

        float area = b*alt;
        return area;

}
    public float calcularPerimetro (float b, float alt){
        
        float perimetro = b*2+alt*2;
        System.out.println("Perímetro = "+ perimetro);
        return 0;
        
    
    }
    
    
    
    
    
}
