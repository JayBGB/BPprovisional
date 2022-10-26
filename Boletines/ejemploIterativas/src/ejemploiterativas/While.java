
package ejemploiterativas;

import javax.swing.JOptionPane;


public class While {
    
    public void bucleWhile () {
    
    int num = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número positivo: "));
    
    while (num>=0){
    
    
    int numero = Integer.parseInt(JOptionPane.showInputDialog("El número " + num + " es positivo. Introduce otro número: "));
    
    num=numero;
    
    
    if (num<0){
    
        JOptionPane.showMessageDialog(null, "El número " + num + " es negativo.");
        break;
    
    }
    }
    
    }
    
}
