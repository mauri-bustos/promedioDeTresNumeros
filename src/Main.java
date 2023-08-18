import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main {

    public static void main(String[] args) {

        do {
            snum1 = JOptionPane.showInputDialog("Ingrese el primer número:");
            snum2 = JOptionPane.showInputDialog("Ingrese el segundo número:");
            snum3 = JOptionPane.showInputDialog("Ingrese el tercer número:");

            if(JOptionPane.CANCEL_OPTION == 2) {
                break;
            }
        } while (!isDouble(snum1) && !isDouble(snum2) && !isDouble(snum3));
        



        try {
            num1 = convertirADouble(snum1);
            num2 = convertirADouble(snum2);
            num3 = convertirADouble(snum3);
            promedio(num1, num2, num3);
            JOptionPane.showMessageDialog(null, resultado);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gracias por tu visita");
        }

    }

    static double num1, num2, num3, resultado;
    static String snum1, snum2, snum3;

    // método que recibe un texto como parámetro
    public static boolean isDouble(String text) {
        Double n;
        try {
            n = Double.parseDouble(text);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static Double convertirADouble(String s) {
        Double d;
        d = Double.parseDouble(s);
        return d;
    }

    public static Double promedio(Double n1, Double n2, Double n3) {
        return resultado = ((n1 + n2 + n3)/3);
    }

}
