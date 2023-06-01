/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeaula;

/**
 *
 * @author jeffe
 */
public class Testeaula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Hello World!!");
        
        int nro = 0;
        String nome = "João";
        
        nro = nro+1;
        
        System.out.println("O nro calculado :"+nro);
        System.out.println("O nome :"+nome);
        
        if (nro >=1)
        {
            System.out.println("ok");
        }else{
            System.out.println("falhou");
        }
        
        for(int i=0;i<=100;i++){
            
            if (i%2==0)
                System.out.println("Nro Par -->"+i);
            
        }
                   
    }
    
}
