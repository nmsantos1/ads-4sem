package model;

public class Caminhao {
    
    private Integer idCaminhao;
    private String marcaCaminhao;
    private String modeloCaminhao;
    private Integer numEixosCaminhao;
    private Double cargaMaxTonCaminhao;

    public Caminhao() {
    }

    public Caminhao(Integer idCaminhao, String marcaCaminhao, String modeloCaminhao, Integer numEixosCaminhao, Double cargaMaxTonCaminhao) {
        this.idCaminhao = idCaminhao;
        this.marcaCaminhao = marcaCaminhao;
        this.modeloCaminhao = modeloCaminhao;
        this.numEixosCaminhao = numEixosCaminhao;
        this.cargaMaxTonCaminhao = cargaMaxTonCaminhao;
    }

    public Integer getIdCaminhao() {
        return idCaminhao;
    }

    public void setIdCaminhao(Integer idCaminhao) {
        this.idCaminhao = idCaminhao;
    }

    public String getMarcaCaminhao() {
        return marcaCaminhao;
    }

    public void setMarcaCaminhao(String marcaCaminhao) {
        this.marcaCaminhao = marcaCaminhao;
    }

    public String getModeloCaminhao() {
        return modeloCaminhao;
    }

    public void setModeloCaminhao(String modeloCaminhao) {
        this.modeloCaminhao = modeloCaminhao;
    }

    public Integer getNumEixosCaminhao() {
        return numEixosCaminhao;
    }

    public void setNumEixosCaminhao(Integer numEixosCaminhao) {
        this.numEixosCaminhao = numEixosCaminhao;
    }

    public Double getCargaMaxTonCaminhao() {
        return cargaMaxTonCaminhao;
    }

    public void setCargaMaxTonCaminhao(Double cargaMaxTonCaminhao) {
        this.cargaMaxTonCaminhao = cargaMaxTonCaminhao;
    }
    
}
