//Implemente um programa que permita a entrada de 20 número e apresenta como resultado o maior número digitado.
package lista01_09;

import java.util.Scanner;

public class Lista01_09 {

    public static void main(String[] args) {
        
        System.out.println("Digite 20 numeros: ");
        Scanner input = new Scanner(System.in);
        double[] nums = new double[20];
        double m = 0;
        for(int i = 0; i < 20; i++){
            System.out.println("n"+(i+1)+":");
            nums[i] = input.nextDouble();
            if(nums[i] > m)
                m = nums[i];
        }
        System.out.println("O maior numero digitado é: "+ m);
    }
    
}