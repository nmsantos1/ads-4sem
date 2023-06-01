package polimorfismo02;

public class polimorfismo02 {

    public static void main(String[] args) {
        
        Professor p1 = new Professor();
        p1.setNomeProfessor("Silvio");
        p1.setEspProfessor("TI");
        p1.cadastrar();
        p1.listar();
    }
    
}
