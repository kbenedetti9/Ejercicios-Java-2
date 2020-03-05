package ejercicio4;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero, numero2;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if(numero > numero2){
        JOptionPane.showMessageDialog(null, "El primer numero es mayor que el segundo");
        }else if (numero == numero2){
        JOptionPane.showMessageDialog(null,"Los numeros son iguales");
        }else if(numero < numero2){
        JOptionPane.showMessageDialog(null, "El segundo numero es mayor que el primero");
        }
    }

}
