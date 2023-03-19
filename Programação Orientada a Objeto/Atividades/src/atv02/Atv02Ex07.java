
package atv02;

import javax.swing.JOptionPane;

public class Atv02Ex07 {

    public static void main(String[] args) {
        
        Object[] sexo = {"Feminino", "Masculino"};
        Object[] corOlho = {"Azuis", "Verdes","Castanhos"};
        Object[] corCabelo = {"Louros", "Castanhos", "Pretos"};
        String sexoSelecionado, corOlhoSelecionado, corCabeloSelecionado;
        int idade, maiorIdade = 0, condB = 0, condC = 0, continuar, i = 0;
        
        
        do{
            sexoSelecionado = (String) JOptionPane.showInputDialog(null, "Selecione seu Sexo:", "Sexo", JOptionPane.INFORMATION_MESSAGE, null, sexo, sexo[0]);
            corOlhoSelecionado = (String) JOptionPane.showInputDialog(null, "Selecione a cor do seus Olhos", "Olhos", JOptionPane.INFORMATION_MESSAGE, null, corOlho, corOlho[0]);
            corCabeloSelecionado = (String) JOptionPane.showInputDialog(null, "Selecione a cor do seu Cabelo", "Cabelo", JOptionPane.INFORMATION_MESSAGE, null, corCabelo, corCabelo[0]);
            idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?","Saída",JOptionPane.YES_NO_OPTION);
            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            if (sexoSelecionado.equals("Feminino") && (idade >= 18) && (idade <= 35)){
                condB++;
            }
            if (corOlhoSelecionado.equals("Castanhos") && corCabeloSelecionado.equals("Castanhos")){
                condC++;
            }
            if (continuar == JOptionPane.YES_OPTION){
                i = -1;
            }
        }while(i == -1);
        
        JOptionPane.showMessageDialog(null, "A maior idade entre os habitantes: "+maiorIdade+"\n"+condB+" pessoas do sexo feminino que possui de 18 a 35 anos!\n"+condC+" pessoas que possuem olhos e cabelos castanhos!");
    }
    
}
