/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
//Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuantas vocales hay en total (recorre el String con charAt)
//Reemplaza todas las a del String anterior por una e.
//Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muestralos en linea recta, separados por un espacio entre cada carácter.
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "La lluvia en Sevilla es una maravilla";
        int vocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {

                vocales++;
            }

        }

        JOptionPane.showMessageDialog(null, "La frase tiene " + vocales + " vocales");

        String nuevaFrase = frase.replace("a", "e");

        JOptionPane.showMessageDialog(null, nuevaFrase);

        for (int i = 0; i < frase.length(); i++) {
            int ascii = frase.codePointAt(i);
            JOptionPane.showMessageDialog(null, ascii);
        }
    }
}
