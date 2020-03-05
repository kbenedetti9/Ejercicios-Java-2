package ejercicio15;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero "));

        String convertido = Integer.toString(numero);

        int cifra = convertido.length();

        JOptionPane.showMessageDialog(null, "El numero es de "+cifra+" cifras");
    }

}
