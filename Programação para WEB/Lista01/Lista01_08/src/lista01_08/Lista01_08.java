//Elabore um programa que leia 10 números e apresente como resultado a sua média
package lista01_08;

import java.util.Scanner;

public class Lista01_08 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double[] vet = new double[10];
        System.out.println("Digite 10 numeros: ");
        int cont = 0;
        double soma = 0;
        while(cont < 10){
            System.out.println("n"+(cont+1)+":");
            
            vet[cont] = input.nextDouble();
            soma += vet[cont];
            
            cont++;
        }
        System.out.println("Média dos numero = "+(soma/10));
    }
}