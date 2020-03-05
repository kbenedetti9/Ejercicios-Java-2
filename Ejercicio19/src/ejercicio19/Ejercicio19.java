package ejercicio19;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
//    Eliminar los espacios de una frase pasada por consola por el usuario.
    public static void main(String[] args) {

        String frase = JOptionPane.showInputDialog("Ingrese una frase");

        String fraseSinEspacio = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                fraseSinEspacio += frase.charAt(i);
            }

        }

        JOptionPane.showMessageDialog(null, fraseSinEspacio);
    }

}
