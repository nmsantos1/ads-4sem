package controller;

import dao.CaminhaoDAO;
import dao.GenericDAO;
import model.Caminhao;

public class CaminhaoCTR {
    
    public Boolean cadastrarCaminhao(String marcaCaminhao, String modeloCaminhao, Integer numEixosCaminhao, Double cargaMaxTonCaminhao){
        
        Caminhao caminhao = new Caminhao();
        caminhao.setMarcaCaminhao(marcaCaminhao);
        caminhao.setModeloCaminhao(modeloCaminhao);
        caminhao.setNumEixosCaminhao(numEixosCaminhao);
        caminhao.setCargaMaxTonCaminhao(cargaMaxTonCaminhao);
        
        GenericDAO dao = new CaminhaoDAO();
        if (dao.cadastrar(caminhao))
            return true;
        else
            return false;
    }
}
