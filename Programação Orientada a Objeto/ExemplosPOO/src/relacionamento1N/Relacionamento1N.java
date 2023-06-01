package relacionamento1N;

public class Relacionamento1N {

    public static void main(String[] args) {
        
        Curso c1 = new Curso();
        c1.setNomeCurso("ADS");
        c1.setChCurso(2400);
        
        Aluno a1 = new Aluno();
        a1.setNomeAluno("Natanael");
        a1.setCpfAluno("354.543.451-46");
        a1.setRaAluno("5444587489666454");
        a1.setCursoAluno(c1);
        
       a1.mostrarAluno();
    }
    
}
