package ejercicio13;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int repeticion = 3;
        String confirmacion;

        String contrasena = JOptionPane.showInputDialog("Ingresa tu contrasena");

        do {
            confirmacion = JOptionPane.showInputDialog("Ingresa tu constrasena");
            if (confirmacion == contrasena) {
                repeticion = 0;

            }

            repeticion--;
        } while (repeticion > 0);
    }

}
