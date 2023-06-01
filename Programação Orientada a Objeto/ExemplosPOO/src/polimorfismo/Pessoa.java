package polimorfismo;

public abstract class Pessoa {
    
    private String nomePessoa;
    private String endPessoa;

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getEndPessoa() {
        return endPessoa;
    }

    public void setEndPessoa(String endPessoa) {
        this.endPessoa = endPessoa;
    }
    
    public abstract void cadastrar();
    
    public abstract void listar();
    
}
