package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero "));
        for (int i = 0; i < 10; i++) {
            int aleatorio = (int) Math.random() * (num2 - num1 + 1) + num1;
            JOptionPane.showMessageDialog(null, "El numero es:" + aleatorio);

        }

    }

}
