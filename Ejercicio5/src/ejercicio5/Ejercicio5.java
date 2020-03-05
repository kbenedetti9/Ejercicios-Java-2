package ejercicio5;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Double num;
       
       num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo"));
       JOptionPane.showMessageDialog(null,"El area del circulo es de: "+calcularArea(num));
       
    }
    
    
    public static Double calcularArea(Double num){
        Double result;
        
        result = Math.PI*Math.pow(num, 2);
        
        return result;
    }
    
}
