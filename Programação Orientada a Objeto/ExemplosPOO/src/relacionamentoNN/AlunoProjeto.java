package relacionamentoNN;

public class AlunoProjeto {
    
    private Aluno aluno;
    private Projeto projeto;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }
    
    void dadosProjeto(){
        System.out.println("Aluno: "+getAluno().getNomeAluno());
        System.out.println("Projeto: "+getProjeto().getNomeProjeto());
    }
}
