//Criar um programa que apresente a série de Fibonacci até o décimo quinto termo. 
package lista01_15;

public class Lista01_15 {

    public static void main(String[] args) {
        
        int n1 = 0, n2 = 1, s;
        System.out.println("Série de Fibonacci até o décimo quinto termo: ");
        for (int i = 1; i < 16; i++) {
            System.out.print(n1+" ");
            s = n1 + n2;
            n1 = n2;
            n2 = s;
        }
    }
}
