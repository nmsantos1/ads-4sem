package polimorfismo;

public class polimorfismo {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNomePessoa("Natanael");
        a1.setEndPessoa("Rua Guido Parminondes");
        a1.setRaAluno(1000);
        a1.setCursoAluno("ADS");
        a1.cadastrar();
        a1.listar();
        
        Professor p1 = new Professor();
        p1.setNomePessoa("Jorge");
        p1.setEndPessoa("Rua 10");
        p1.setEspProfessor("TI");
        p1.setMatProfessor("001");
        p1.cadastrar();
        p1.listar();
    }
    
}
