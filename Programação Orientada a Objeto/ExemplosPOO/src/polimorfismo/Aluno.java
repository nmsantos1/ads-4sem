package polimorfismo;

public class Aluno extends Pessoa{
    
    private Integer raAluno;
    private String cursoAluno;

    public Integer getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(Integer raAluno) {
        this.raAluno = raAluno;
    }

    public String getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(String cursoAluno) {
        this.cursoAluno = cursoAluno;
    }

    @Override
    public void cadastrar() {
        
        System.out.println("Aluno cadastrado com sucesso!");
    }

    @Override
    public void listar() {
        
        System.out.println("Alunos listados!");
    }
    
}
