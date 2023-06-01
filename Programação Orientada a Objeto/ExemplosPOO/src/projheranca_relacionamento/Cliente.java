package projheranca_relacionamento;

public class Cliente extends Pessoa{
    
    private String localTrabCliente;
    private Double salarioCliente;
    private Cidade cidade;

    public String getLocalTrabCliente() {
        return localTrabCliente;
    }

    public void setLocalTrabCliente(String localTrabCliente) {
        this.localTrabCliente = localTrabCliente;
    }

    public Double getSalarioCliente() {
        return salarioCliente;
    }

    public void setSalarioCliente(Double salarioCliente) {
        this.salarioCliente = salarioCliente;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    public void listarCliente(){
        System.out.println("\nCLIENTE: ");
        System.out.println("Nome: "+getNomePessoa());
        System.out.println("Endereço: "+getEndPessoa());
        System.out.println("CPF: "+getCpfPessoa());
        System.out.println("Telefone: "+getTelPessoa());
        System.out.println("Local de Trabalho: "+getLocalTrabCliente());
        System.out.println("Salario: "+getSalarioCliente());
        System.out.println("Cidade: "+getCidade().getNomeCidade());
    }
}
