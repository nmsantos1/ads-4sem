package herancaproduto;

public class HerancaProduto {

    public static void main(String[] args) {
        
        Bicicleta b1 = new Bicicleta();
        b1.setIdProduto(1);
        b1.setCorProduto("Preto");
        b1.setMarcaProduto("Caloi");
        b1.setAroBicicleta(26);
        
        Carro c1 = new Carro();
        c1.setIdProduto(2);
        c1.setCorProduto("Vermelho");
        c1.setMarcaProduto("Fiat");
        c1.setQtdPortaCarro(4);
        
        Moto m1 = new Moto();
        m1.setIdProduto(2);
        m1.setCorProduto("Preto");
        m1.setMarcaProduto("Honda");
        m1.setCilindradaMoto(250);
        
        b1.exibirDadosProduto();
        b1.exibirDadosBicicleta();
        
        c1.exibirDadosProduto();
        c1.exibirDadosCarro();
        
        m1.exibirDadosProduto();
        m1.exibirDadosMoto();
    }
    
}
