package relacionamentoNN;

public class RelacionamentoNN {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.setNomeAluno("Natanael");
        a1.setIdadeAluno(20);
        
        Aluno a2 = new Aluno();
        a2.setNomeAluno("Eliane");
        a2.setIdadeAluno(35);
        
        Projeto p1 = new Projeto();
        p1.setNomeProjeto("POO");
        p1.setHorasProjeto(120);
        
        AlunoProjeto ap = new AlunoProjeto();
        ap.setAluno(a1);
        ap.setProjeto(p1);
        
        AlunoProjeto ap1 = new AlunoProjeto();
        ap1.setAluno(a2);
        ap1.setProjeto(p1);              
    }
    
}
