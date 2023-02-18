//Crie um programa que mostre os números ímpares em ordem decrescente os números no intervalo de 500 a 700.
package lista01_03;


public class Lista01_03 {

    public static void main(String[] args) {
        
        System.out.println("Numeros impares decrescente de 700 a 500:");
        for(int i = 700; i > 499; i--){
            if( i%2 != 0){
                System.out.println(i);
            }
            
        }
        
    }
    
}
