package exercicio0505Conta;

public class ExecConta {

    public static void main(String[] args) {
        
        Conta c1 = new Conta();
        c1.setIdConta(01);
        c1.setNumConta(123456);
        c1.setTitularConta("Natanael");
        c1.setSaldoConta(1000.00);
        c1.setTipoConta("P");
        
        c1.mostrarSaldoConta();
        System.out.println("");
        
        c1.abrirConta();
        System.out.println("");
        
        c1.depositar(1000.00);
        c1.mostrarSaldoConta();
        
        c1.sacar(2100.00);
        c1.mostrarSaldoConta();
        
        System.out.println("===========================");
        
        Conta c2 = new Conta();
        c2.setIdConta(02);
        c2.setNumConta(654321);
        c2.setTitularConta("Eliane");
        c2.setSaldoConta(2000.00);
        c2.setTipoConta("C");
        
        c2.mostrarSaldoConta();
        System.out.println("");
        
        c2.abrirConta();
        System.out.println("");
        
        c2.depositar(1000.00);
        c2.mostrarSaldoConta();
        
        c2.sacar(1000.00);
        c2.mostrarSaldoConta();
        
        System.out.println("");
        c2.fecharConta();
    }
    
}
