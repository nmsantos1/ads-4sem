//
package lista01_06;

public class Lista01_06 {

    public static void main(String[] args) {

        double s = 0;
        int i = 1, n = 1;
        while (i<51){
            s += (double) n/i;
            n += 2;
            i++;
        }
        System.out.println("S = "+s);  
    }
    
}
