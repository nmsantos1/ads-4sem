
package atv02;

import javax.swing.JOptionPane;

public class Atv02Ex06 {


    public static void main(String[] args) {
        
        int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos:"));
        
        String nomeAluno[] = new String [qtdAlunos];
        double notaAluno[] = new double [qtdAlunos];
        double maiorNotaAluno = notaAluno[0], somaNotasAlunos = 0;
        int posicaoMaiorNotaAluno = 0;
        for(int i = 0; i < qtdAlunos; i++){
            nomeAluno[i] = JOptionPane.showInputDialog("Nome do aluno:");
            notaAluno[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno:"));
            if (maiorNotaAluno < notaAluno[i]){
                maiorNotaAluno = notaAluno[i];
                posicaoMaiorNotaAluno = i;
            }
            somaNotasAlunos = somaNotasAlunos + notaAluno[i];
        }
        JOptionPane.showMessageDialog(null, "A maior nota da classe é do aluno: "+nomeAluno[posicaoMaiorNotaAluno]+"\n"
                +(somaNotasAlunos/(double)qtdAlunos)+" é a media das notas da classe!");
    }
}
