/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;


/**
 *
 * @author jeffe
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total = 0, media = 0;
        int cont=0, n=0;
        
        Scanner input = new Scanner(System.in);

        final double pi = 3.14;

        System.out.println("Digite um valor, para a quantidade de números que deseja colocar: ");

        n = input.nextInt();

        double[] fila = new double[n];

        System.out.println("Completo a lista array: ");

        while(cont <= n){

            System.out.println("Digite a "+ (cont+1) + " posição: ");

            fila[cont] = input.nextDouble();

            cont++;

            media += fila[cont];

        }

        System.out.println("A média total é = " + total / cont);

        }
}