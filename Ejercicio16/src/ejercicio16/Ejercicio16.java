package ejercicio16;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
//    Pide un número por teclado e indica si es un número primo o no.
//    Un número primo es aquel solo puede dividirse entre 1 y si mismo.
//    Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
//Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
//NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.
    public static void main(String[] args) {
        int numero;
        int primo = 0, divisible = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

        for (int i = 1; i <= numero; i++) {

            if (i == numero && numero % i == 0) {
                primo++;

            }
            if (i == 1 && numero % 1 == 0) {
                primo++;
            }
            if (i != numero && i != 1 && numero % i == 0) {
                divisible++;
            }
        }

        if (primo == 2 && divisible == 0) {
            JOptionPane.showMessageDialog(null, "El numero es primo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero NO es primo");
        }

        JOptionPane.showMessageDialog(null, "primo " + primo);
        JOptionPane.showMessageDialog(null, "divisible " + divisible);
    }

}
