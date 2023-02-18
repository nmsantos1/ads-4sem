//Escreva um programa que permita a entrada de dois números e mostre como resultado a soma dos números pares entre os números lidos.
package lista01_07;

import java.util.Scanner;

public class Lista01_07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int n1 = input.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int n2 = input.nextInt();
        int s = 0;
        if(n1<n2){
            for(int i = (n1+1); i < n2; i++){
                if(i%2 == 0){
                    s += i;
                }
            }
        }else{
            for(int j = (n1-1); j > n2; j--){
                if(j%2 == 0){
                    s += j;
                }
            }
        }
        System.out.println("A soma dos números pares entre "+n1+" e "+n2+": "+s);
    }
    
}
