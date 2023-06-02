package dao;

import java.sql.Statement;
import model.Caminhao;

public class CaminhaoDAO implements GenericDAO{

    @Override
    public Boolean cadastrar(Object object) {
        
        Caminhao caminhao = (Caminhao) object;
        
        try{
            Conexao.ConectDB();
            Statement stmt = Conexao.con.createStatement();
            String sql = "insert into caminhao(marcacaminhao, modelocaminhao, numeixocaminhao, cargamaxtoncaminhao) "
                    + "values("
                    + "'" + caminhao.getMarcaCaminhao() +"',"
                    + "'" + caminhao.getModeloCaminhao() +"',"
                    +       caminhao.getNumEixosCaminhao() +","
                    +       caminhao.getCargaMaxTonCaminhao() +");";
            stmt.execute(sql);
            Conexao.CloseDB();
            return true;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    
}
