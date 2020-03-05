/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
//Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {

            if (i % 2 == 0 || i % 3 == 0) {

                JOptionPane.showMessageDialog(null, "Este numero es divisible por 2 o por 3: " + i);
            }

        }
    }

}
