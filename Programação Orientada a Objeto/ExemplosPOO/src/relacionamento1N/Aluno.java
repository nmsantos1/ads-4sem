package relacionamento1N;

public class Aluno {
    
    private String nomeAluno;
    private String cpfAluno;
    private String raAluno;
    private Curso cursoAluno;

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public String getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(String raAluno) {
        this.raAluno = raAluno;
    }

    public Curso getCursoAluno() {
        return cursoAluno;
    }

    public void setCursoAluno(Curso cursoAluno) {
        this.cursoAluno = cursoAluno;
    }
    
    void mostrarAluno(){
        System.out.println("Nome: "+getNomeAluno());
        System.out.println("CPF: "+getCpfAluno());
        System.out.println("Curso: "+ getCursoAluno().getNomeCurso());
    }
}
