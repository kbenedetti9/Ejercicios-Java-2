package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       char tecla;
       
       tecla = JOptionPane.showInputDialog("Presiona una tecla").charAt(0);
       
       int ascii = (int) tecla;
       
       JOptionPane.showMessageDialog(null, "El codigo ASCII para esta tecla es: "+ascii );
     
    }
    
}
