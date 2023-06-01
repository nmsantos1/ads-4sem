/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author Aluno
 */
public class Professor extends Pessoa{
    
    private String espProfessor;
    private String matProfessor;

    public String getEspProfessor() {
        return espProfessor;
    }

    public void setEspProfessor(String espProfessor) {
        this.espProfessor = espProfessor;
    }

    public String getMatProfessor() {
        return matProfessor;
    }

    public void setMatProfessor(String matProfessor) {
        this.matProfessor = matProfessor;
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
