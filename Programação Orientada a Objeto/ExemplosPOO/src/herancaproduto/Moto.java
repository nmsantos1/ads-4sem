package herancaproduto;

public class Moto extends Produto{
    
    private Integer cilindradaMoto;

    public Integer getCilindradaMoto() {
        return cilindradaMoto;
    }

    public void setCilindradaMoto(Integer cilindradaMoto) {
        this.cilindradaMoto = cilindradaMoto;
    }       
    
    public void acelerarMoto(){
        System.out.println("Acelerou moto!");
    }
    
    public void exibirDadosMoto(){
        System.out.println("Cilindrada: "+this.getCilindradaMoto());
    }
}