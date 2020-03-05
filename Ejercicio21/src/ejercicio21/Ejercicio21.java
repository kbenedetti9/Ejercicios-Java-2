package ejercicio21;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta nuevaCuenta = new Cuenta("Karen Benedetti");
        Double cantidad;
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opcion", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Consignar", "Retirar"}, "Opcion 1");

        if (seleccion == 0) {
            cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a consignar"));
            nuevaCuenta.ingresar(cantidad);
        } else if (seleccion == 1) {
            if (nuevaCuenta.getCantidad() > 0) {
                cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a retirar"));
                nuevaCuenta.retirar(cantidad);
            } else {
                JOptionPane.showMessageDialog(null, "Usted no puede realizar ningun retiro ");
            }

        }

        JOptionPane.showMessageDialog(null, "Cantidad de dinero en mi cuenta: " + nuevaCuenta.getCantidad());

    }

}
