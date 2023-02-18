//Crie um programa que mostre os números: 0, 2, 4, 6, 8, 10,...,20
package lista01_05;

public class Lista01_05 {

    public static void main(String[] args) {
        
        System.out.println("Completando a sequência 0, 2, 4,  6,  8, 10,...,20:");
        for(int i = 0; i < 21; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        
    }
    
}
