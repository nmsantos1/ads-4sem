/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

/**
 *
 * @author Aluno
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Meu primeiro programa em Java!");
        
        System.out.println("Hello World!");
        //==================================
        int numero = 0;
        String nome = "Joao";
        
        numero = numero+1;
        //numero++;
        
        System.out.println("O numero calculado: "+numero);
        System.out.println("O nome: "+nome);
        
        if (numero >= 1) {
            System.out.println("ok");
        }else{
            System.out.println("falhou");
        }
        //==================================
        for(int i=0;i<100;i++){
            
            if (i%2==0)
                System.out.println("Numero Par -->"+i);
        }
        
    }
    
}
