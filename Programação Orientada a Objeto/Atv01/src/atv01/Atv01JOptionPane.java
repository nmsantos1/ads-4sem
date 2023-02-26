package atv01;

import javax.swing.JOptionPane;

public class Atv01JOptionPane {

    public static void main(String[] args) {
        
        Double pesoideal = null;
        
        Object[] itens = {"Masculino", "Feminino"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Selecione seu sexo:", 
                "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        Double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        
        if(selectedValue.equals("Masculino")){
            pesoideal = (72.7 * altura) - 58;
        }else if(selectedValue.equals("Feminino")){
            pesoideal = (62.1 * altura) - 44.7;
        }else{
            System.out.println("Dados inválidos!");
        }
        JOptionPane.showMessageDialog(null,"Seu peso ideal seria: " + pesoideal);
    }
    
}
