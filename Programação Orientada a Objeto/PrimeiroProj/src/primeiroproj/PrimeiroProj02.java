package primeiroproj;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class PrimeiroProj02 {

    public static void main(String[] args) {
        
        DecimalFormat decimal = new DecimalFormat();
        decimal.applyPattern("#,##0.00");
        Double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + decimal.format(peso / Math.pow(altura, 2)));
    }
}
