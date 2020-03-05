package ejercicio8;

import javax.swing.JOptionPane;

/**
 *
 * @author Karen Benedetti M
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
//    Lee un número por teclado que pida el precio de un producto (puede tener decimales) 
//    y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.
    public static void main(String[] args) {

        Double precio;

        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio de un producto"));
        JOptionPane.showMessageDialog(null,"El precio final es de :"+calcularPrecioFinal(precio));

    }

    public static Double calcularPrecioFinal(Double precio){
    Double result;
    result = (precio*0.21)+precio;
    return result;
    }
}
