
package atv02;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int numero, result;
        
        System.out.println("Qual tabuada deseja imprimir?");
        numero = ler.nextInt();
        
        for(int i = 1; i <= 10; i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
    }
}
