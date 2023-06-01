package herancaproduto;

public class Produto {
    
    private Integer idProduto;
    private String corProduto;
    private String marcaProduto;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }

    public void setCorProduto(String corProduto) {
        this.corProduto = corProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }
    
    public void exibirDadosProduto(){
        System.out.println("\nID: " + this.getIdProduto());
        System.out.println("Cor: " + this.getCorProduto());
        System.out.println("Marca: " + this.getMarcaProduto());
    }
    
}
