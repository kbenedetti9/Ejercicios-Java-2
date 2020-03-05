package ejercicio6;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a verificar"));
        if(divisible(num)== true){
        JOptionPane.showMessageDialog(null, "El numero es divisible por 2");
        }else{
        JOptionPane.showMessageDialog(null, "El numero NO es divisible por 2");
        }
        

    }

    public static boolean divisible(int num) {
        boolean result;
        if (num % 2 == 0) {
            result = true;
        } else {

            result = false;
        }

        return result;
    }

}
