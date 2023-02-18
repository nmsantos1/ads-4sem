//Faça um algoritmo que escreva os múltiplos de 10 no intervalo de 1 a 100
package lista01_04;

public class Lista01_04 {

    public static void main(String[] args) {
        
        System.out.println("Numeros múltiplos de 10 no intervalo de 1 a 100:");
        for(int i = 1; i < 101; i++){
            if(i%10 == 0){
                System.out.println(i);
            }
        }
    
    }
    
}
