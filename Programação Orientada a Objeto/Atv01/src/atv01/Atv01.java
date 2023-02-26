package atv01;

import java.util.Scanner;

public class Atv01 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a opção correspondente ao seu sexo: ");
        System.out.println("1 - Feminino");
        System.out.println("2 - Masculino");
        int s = input.nextInt();
        System.out.println("Digite sua altura: ");
        double h = input.nextDouble();
        double pesoIdeal = 0.0;
        switch (s) {
            case 1:
                pesoIdeal = (62.1*h) - 44.7;
                break;
            case 2:
                pesoIdeal = (72.7*h) - 58;
                break;
            default:
                System.out.println("Opção invalida!");
                break;
        }
        System.out.println("Seu peso ideal é: "+pesoIdeal);
        
        /* 
        
        if (s.equalsIgnoreCase("f")){
            pesoIdeal = (62.1*h) - 44.7;
        } else if(s.equalsIgnoreCase("m")) {
            pesoIdeal = (72.7*h) - 58;
        } else
            System.out.println("Opção invalida!");
        
        */
    }
    
}
