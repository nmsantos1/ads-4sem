package projheranca_relacionamento;

public class relacNNPessoaClienteCidade {

    public static void main(String[] args) {
        
        Cidade c1 = new Cidade();
        c1.setNomeCidade("Jales");
        c1.setEstadoCidade("São Paulo");
        
        Cliente cl1 = new Cliente();
        cl1.setNomePessoa("Natanael");
        cl1.setEndPessoa("Rua Guido Parminondes");
        cl1.setCpfPessoa("123.456.789-10");
        cl1.setTelPessoa("(17)99723-7061");
        cl1.setLocalTrabCliente("Rua 10");
        cl1.setSalarioCliente(1550.00);
        cl1.setCidade(c1);
        
        cl1.listarCliente();
        
        cl1.alterarTelefonePessoa("(17)99713-1803");
        
        cl1.listarCliente();
    }
    
}
