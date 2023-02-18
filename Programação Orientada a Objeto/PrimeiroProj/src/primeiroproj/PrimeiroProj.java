
package primeiroproj;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PrimeiroProj {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat();
        decimal.applyPattern("#,##0.00");
        
        System.out.println("Digite o peso: ");
        Double peso = ler.nextDouble();
        System.out.println("Digite a altura: ");
        Double altura = ler.nextDouble();
        System.out.println("O IMC é = "+ decimal.format((peso / (Math.pow(altura, 2)))));
    }
    
}