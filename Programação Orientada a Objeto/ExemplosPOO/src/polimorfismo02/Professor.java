package polimorfismo02;

public class Professor implements Generic{
    
    private String nomeProfessor;
    private String espProfessor;

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEspProfessor() {
        return espProfessor;
    }

    public void setEspProfessor(String espProfessor) {
        this.espProfessor = espProfessor;
    }
    
    @Override
    public void cadastrar() {
        
        System.out.println("Professor cadastrado com sucesso!");
    }

    @Override
    public void listar() {
        
        System.out.println("Professores listados!");
    }
    
}
