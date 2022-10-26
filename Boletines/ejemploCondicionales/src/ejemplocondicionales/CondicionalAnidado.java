
package ejemplocondicionales;


public class CondicionalAnidado {
    
    public void consultarDia (int dia){
    
    if (dia==1){
    
        System.out.println("Es lunes.");
    }
    
             else if (dia==2) System.out.println("Es martes");
                 
                    else if (dia==3) System.out.println("Es miércoles");
    
                         else if (dia==4) System.out.println("Es jueves.");
    
                             else if (dia==5) System.out.println("Es viernes.");
    
                                 else if (dia==6) System.out.println("Es sábado.");
    
                                     else if (dia==7) System.out.println("Es domingo.");
    
                                        else System.out.println("Introduce un número entre 1 y 7.");
    }
    
    
    
    public void diaSwitch (int dia){
        
        switch (dia){
        
            case 1:
                System.out.println("LUNES");
                break;
                
            case 2:
                System.out.println("MARTES");
                break;
                
            case 3:
                System.out.println("MIÉRCOLES");
                break;
                
            case 4:
                System.out.println("JUEVES");
                break;
                
            case 5:
                System.out.println("VIERNES");
                break;
                
            case 6:
                System.out.println("SÁBADO");
                break;
                
            case 7:
                System.out.println("DOMINGO");
                break;
                
            default:
                System.out.println("¡ERROR! INTRODUCE UN NÚMERO ENTRE 1 Y 7");
                break;
        }
        
        }
    
    
    
    }


