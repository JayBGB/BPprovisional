
package ejemplocondicionales;

import javax.swing.JOptionPane;


public class EjemploCondicionales {

    
    public static void main(String[] args) {
        
        //CONDICIONAL SIMPLE
        System.out.println("------------- CONDICIONAL SIMPLE -------------");
        
        CondicionalSimple objCon = new CondicionalSimple ();
        objCon.mayorEdad(16);
        

        //pedimos datos utilizando JOptionPane en lugar de System.in
        
        String res = JOptionPane.showInputDialog("Condicional simple\nIntroduce tu edad: ");
        System.out.println(res);
        //int ed = Integer.parseInt(JOptionPane.showInputDialog("edade"));
        
        
        //¿Cómo paso de este String a un int?
        
        int edade=Integer.parseInt(res);
        objCon.mayorEdad(edade);
        
        //CONDICIONAL DOBLE
        
        System.out.println("------------- CONDICIONAL DOBLE -------------");
        
        CondicionalDoble objConsulta = new CondicionalDoble ();
        objConsulta.consultarEdad(24);
        
        String cons = JOptionPane.showInputDialog("Condicional doble\nIntroduce tu edad: ");
        System.out.println(cons);
        int consulta=Integer.parseInt(cons);
        objConsulta.consultarEdad(consulta);
        
        int ed = Integer.parseInt(JOptionPane.showInputDialog("edade"));
        System.out.println(ed);
        
        System.out.println("------------- CONDICIONAL DOBLE SIMPLIFICADO -------------");
        
        objConsulta.operarEdad(457);
        
        
          System.out.println("------------- CONDICIONAL ANIDADO -------------");
          
          //int edd = Integer.parseInt(JOptionPane.showInputDialog("Condicional anidado\nIntroduce tu edad: "));
          CondicionalAnidado objAnidado = new CondicionalAnidado();
          //objAnidado.consultarEdad(edd);
          
          
        // System.out.println("------------- PEDIR INT (STILL NESTING)-------------"); 
    
        // int ed1 = pedirInt ("Pedir int\nDame el valor edad; ");
        // objAnidado.consultarEdad(ed1);
        
        int dia = pedirInt ("Introduce el número del día de la semana que desees: ");
        objAnidado.consultarDia(dia);
        
        objAnidado.diaSwitch(dia);
         
         
   
        
    }
    
     public static int pedirInt (String mensaje) {
    
    return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    
    }
     
     public void ver(){
     
     int respuesta = pedirInt ("Dame un valor");
         System.out.println(respuesta);
     
     }
    
}
