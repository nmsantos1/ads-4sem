package controller;

import dao.FuncionarioDAO;
import dao.GenericDAO;
import model.Funcionario;

public class FuncionarioCTR {
    
    public Boolean cadastrarFuncionario(Integer rmFuncionario, String nomeFuncionario, String ederecoFuncionario, String telefoneFuncionario){
        
        Funcionario funcionario = new Funcionario();
        funcionario.setRmFuncionario(rmFuncionario);
        funcionario.setNomeFuncionario(nomeFuncionario);
        funcionario.setEnderecoFuncionario(ederecoFuncionario);
        funcionario.setTelefoneFuncionario(telefoneFuncionario);
        
        GenericDAO dao = new FuncionarioDAO();
        if (dao.cadastrar(funcionario))
            return true;
        else
            return false;
    }
}
