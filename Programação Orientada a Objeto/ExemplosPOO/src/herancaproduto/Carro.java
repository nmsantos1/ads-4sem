package herancaproduto;

public class Carro extends Produto{
    
    private Integer qtdPortaCarro;
    
    public Integer getQtdPortaCarro() {
        return qtdPortaCarro;
    }

    public void setQtdPortaCarro(Integer qtdPortaCarro) {
        this.qtdPortaCarro = qtdPortaCarro;
    }
    
    public void freioDeMaoCarro(){
        System.out.println("Puxou o freio de mão!");
    }
    
    public void exibirDadosCarro(){
        System.out.println("Portas: "+this.getQtdPortaCarro());
    }
        
}