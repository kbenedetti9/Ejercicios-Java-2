package ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
//    Muestra los números primos entre 1 y 100.
    public static void main(String[] args) {

        int primo = 0, divisible = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {

                if (j == i && i % j == 0) {
                    primo++;

                }
                if (j == 1 && i % 1 == 0) {
                    primo++;
                }
                if (j != i && j != 1 && i % j == 0) {
                    divisible++;
                }
            }
            if (primo == 2 && divisible == 0) {
                JOptionPane.showMessageDialog(null, i);

            }
            primo = 0;
            divisible = 0;
        }
    }

}
