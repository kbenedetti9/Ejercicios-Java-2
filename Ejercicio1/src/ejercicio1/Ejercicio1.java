package ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String distancia;
        String dias;
        Double total;

        distancia = JOptionPane.showInputDialog("Distancia a recorrer");
        dias = JOptionPane.showInputDialog("Dias estancia");
        Double dis = Double.parseDouble(distancia);
        int di = Integer.parseInt(dias);
        
        if(dis>1000 && di>7){
            
            total = 35*dis;
            total= total*0.3;
            
        }else{
            total = 35*dis;
        }

        JOptionPane.showMessageDialog(null,"El valor del pasaje de avion es de "+ total);
    }

}
