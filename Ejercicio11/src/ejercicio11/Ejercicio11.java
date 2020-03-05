package ejercicio11;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
//    Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
    public static void main(String[] args) {
        int numVentas;
        int total = 0;
        numVentas = Integer.parseInt(JOptionPane.showInputDialog("Numero de ventas a introducir"));

        for (int i = 0; i < numVentas; i++) {

            total += Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la venta"));
        }
        JOptionPane.showMessageDialog(null, "El total de la venta fue de: " + total);
    }

}
