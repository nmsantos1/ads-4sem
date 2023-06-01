package projetoanimal;

public class ProjetoAnimal {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.idAnimal = 1;
        a1.nomeAnimal = "Hunter";
        a1.pesoAnimal = 7.5;
        a1.porteAnimal = "pequeno";
        a1.racaAnimal = "comum";
        
        Animal a2 = new Animal();
        a2.idAnimal = 2;
        a2.nomeAnimal = "Pipoca";
        a2.pesoAnimal = 21.5;
        a2.porteAnimal = "grande";
        a2.racaAnimal = "pastor alemão";
        
        System.out.println("=========== Objeto 1 ===========");
        System.out.println("Nome: "+a1.nomeAnimal);
        System.out.println("Peso: "+a1.pesoAnimal);
        System.out.println("Porte: "+a1.porteAnimal);
        System.out.println("Raça: "+a1.racaAnimal);
        
        System.out.println("=========== Objeto 2 ===========");
        System.out.println("Nome: "+a2.nomeAnimal);
        System.out.println("Peso: "+a2.pesoAnimal);
        System.out.println("Porte: "+a2.porteAnimal);
        System.out.println("Raça: "+a2.racaAnimal);
    }
    
}
