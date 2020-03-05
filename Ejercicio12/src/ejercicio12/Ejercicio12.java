package ejercicio12;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
//    Realiza una aplicación que nos calcule una ecuación de segundo grado. 
//    Debes pedir las variables a, b y c por teclado y comprobar antes que el
//    discriminante (operación en la raíz cuadrada). Para la raíz cuadrada usa 
//    el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
    public static void main(String[] args) {
        Double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de c"));

        JOptionPane.showMessageDialog(null, "El resultado es :" + calcularNegativo(a, b, c));
        JOptionPane.showMessageDialog(null, "El resultado es :" + calcularPositivo(a, b, c));
    }

    public static Double calcularNegativo(Double a, Double b, Double c) {
        Double result;

        result = Math.pow(b, 2) - (4 * a * c);
        result = ((b * (-1)) - Math.sqrt(result)) / (2 * a);
        return result;

    }

    public static Double calcularPositivo(Double a, Double b, Double c) {
        Double result;

        result = Math.pow(b, 2) - (4 * a * c);
        result = ((b * (-1)) + Math.sqrt(result)) / (2 * a);
        return result;

    }

}
