package ejercicio23;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de contraseñas que desea generar"));

        Password listaContrasenas[] = new Password[numero];

        for (int i = 0; i <numero; i++) {
            Password contrasena = new Password();
            int longitud = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño para la contraseña numero #" + i));
            contrasena.setLongitud(longitud);
            contrasena.setContrasena(contrasena.generarContrasena(longitud));

            listaContrasenas[i] = contrasena;

            JOptionPane.showMessageDialog(null, "La contraseña #" + i + "generada fue " + listaContrasenas[i].getContrasena());

        }
    }

}
