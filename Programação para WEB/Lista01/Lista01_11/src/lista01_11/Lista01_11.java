//Desenvolva um programa que apresente todos os números positivos divisíveis por 4 que sejam menores que 200
package lista01_11;

public class Lista01_11 {

    public static void main(String[] args) {
        
        for(int i = 1; i < 200; i++){
            if(i%4 == 0)
                System.out.println(i);
        }
    }
    
}
