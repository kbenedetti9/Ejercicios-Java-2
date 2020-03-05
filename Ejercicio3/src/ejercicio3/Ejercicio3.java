package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));
        JOptionPane.showMessageDialog(null,"El resultado de la suma es:"+suma(num1, num2));
        JOptionPane.showMessageDialog(null,"El resultado de la resta es:"+resta(num1, num2));
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es:"+multiplicacion(num1, num2));
        JOptionPane.showMessageDialog(null,"El resultado de la division es:"+division(num1, num2));
        JOptionPane.showMessageDialog(null,"El resultado del modulo es:"+ modulo(num1, num2));
    }

    public static int suma(int n1, int n2) {
        int result;
        result = n1 + n2;

        return result;
    }

    public static int resta(int n1, int n2) {
        int result;
        result = n1 - n2;

        return result;
    }

    public static int multiplicacion(int n1, int n2) {
        int result;
        result = n1 * n2;

        return result;
    }

    public static int division(int n1, int n2) {
        int result;
        result = n1 / n2;

        return result;
    }

    public static int modulo(int n1, int n2) {
        int result;
        result = n1 % n2;

        return result;
    }

}
