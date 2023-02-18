//Criar um programa para exiba os próximos 10 números a partir de um número lido
package lista01_12;

import java.util.Scanner;

public class Lista01_12 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = input.nextInt();
        System.out.println("Os próximos 10 numeros são: ");
        int cont = n;
        do{
            cont++;
            System.out.print(cont+" ");
            
        }while(cont != (n+10));
    }
    
}
