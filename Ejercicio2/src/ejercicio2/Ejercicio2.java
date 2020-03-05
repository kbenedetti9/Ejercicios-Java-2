/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String peso;
        int costo;
        int repite = 1;

        ArrayList<Bulto> totalBultos = new ArrayList();
        int masPesado = 0;
        int masLiviano = 0;
        int totalPeso = 0;
        int promedio = 0;
        int totalDinero = 0;

        do {
            peso = JOptionPane.showInputDialog("Ingrese el peso del bulto");
            Integer valorPeso = Integer.parseInt(peso);

            if (valorPeso > 18000 || valorPeso > 500) {
                JOptionPane.showMessageDialog(null, "El bulto no puede ser ingresado");
            } else {
                Bulto bulto = new Bulto();
                bulto.setPeso(valorPeso);

                if (valorPeso >= 0 && valorPeso <= 25) {

                    bulto.setValor(0);
                } else if (valorPeso >= 26 && valorPeso <= 300) {
                    costo = valorPeso * 1500;
                    bulto.setValor(costo);
                } else if (valorPeso >= 301 && valorPeso <= 500) {
                    costo = valorPeso * 2500;
                    bulto.setValor(costo);
                }

                totalBultos.add(bulto);
            }
            String repeticion = JOptionPane.showInputDialog("Si desea agregar otro bulto oprima 1");
            Integer rep = Integer.parseInt(repeticion);
            repite = rep;
        } while (repite == 1);

        JOptionPane.showMessageDialog(null, "El total de bultos ingresados es de " + totalBultos.size());
        for (int i = 0; i < totalBultos.size(); i++) {

            if (masPesado < totalBultos.get(i).getPeso()) {
                masPesado = totalBultos.get(i).getPeso();
            } else {
                masPesado = masPesado;
            }

        }
        JOptionPane.showMessageDialog(null, "El bulto mas pesado pesa: " + masPesado);

        masLiviano = totalBultos.get(0).getPeso();
        for (int i = 0; i < totalBultos.size(); i++) {

            if (masLiviano > totalBultos.get(i).getPeso()) {
                masLiviano = totalBultos.get(i).getPeso();
            } else {
                masLiviano = masLiviano;
            }

        }
        JOptionPane.showMessageDialog(null, "El bulto mas liviano pesa: " + masLiviano);

        for (int i = 0; i < totalBultos.size(); i++) {

            totalPeso = totalPeso + totalBultos.get(i).getPeso();

        }
        promedio = totalPeso / totalBultos.size();
        JOptionPane.showMessageDialog(null, "El promedio de peso de los bultos es de: " + promedio);

        for (int i = 0; i < totalBultos.size(); i++) {

            totalDinero = totalBultos.get(i).getValor();

        }

        JOptionPane.showMessageDialog(null, "El total en pesos es de: $" + totalDinero);
        totalDinero = totalDinero * 3000;
        JOptionPane.showMessageDialog(null, "El total en dolares es de: $" + totalDinero);
    }

}
