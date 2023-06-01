package herancaproduto;

public class Bicicleta extends Produto{
    
    private Integer aroBicicleta;

    public Integer getAroBicicleta() {
        return aroBicicleta;
    }

    public void setAroBicicleta(Integer aroBicicleta) {
        this.aroBicicleta = aroBicicleta;
    }
    
    public void pedalarBicicleta(){
        System.out.println("Pedalou bicicleta!");
    }
    
    public void exibirDadosBicicleta(){
        System.out.println("Aro: "+this.getAroBicicleta());
    }
}