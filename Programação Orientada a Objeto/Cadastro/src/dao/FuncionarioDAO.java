package dao;

import java.sql.Statement;
import model.Funcionario;

public class FuncionarioDAO implements GenericDAO{

    @Override
    public Boolean cadastrar(Object object) {
        
        Funcionario funcionario = (Funcionario) object;
        
        try{
            Conexao.ConectDB();
            Statement stmt = Conexao.con.createStatement();
            String sql = "insert into funcionario(rmfuncionario, nomefuncionario, enderecofuncionario, telefonefuncionario) "
                    + "values("
                    +       funcionario.getRmFuncionario() +","
                    + "'" + funcionario.getNomeFuncionario() +"',"
                    + "'" + funcionario.getEnderecoFuncionario() +"',"
                    + "'" + funcionario.getTelefoneFuncionario() +"');";
            stmt.execute(sql);
            Conexao.CloseDB();
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
