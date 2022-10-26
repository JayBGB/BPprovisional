
package bol7_1;

import javax.swing.JOptionPane;


public class Bol7_1 {

    
    public static void main(String[] args) {
        
        Teclado obj = new Teclado ();
        double numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        obj.positivo(numero);
        
    }
    
}
