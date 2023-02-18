package lista01_14;

public class Lista01_14 {

    public static void main(String[] args) {
        double s = 0.0, n1=37, n2=38;
        for(int i = 1; i < 38; i++){
            s += (n1 * n2) / (double)i;
            n1--;
            n2--;
        }
        System.out.println("O valor de S: "+s);
    }
    
}
