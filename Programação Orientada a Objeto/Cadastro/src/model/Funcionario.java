package model;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    
    private Integer idFuncionario;
    private Integer rmFuncionario;
    private String nomeFuncionario;
    private String enderecoFuncionario;
    private String telefoneFuncionario;

    public Funcionario() {
    }

    public Funcionario(Integer idFuncionario, Integer rmFuncionario, String nomeFuncionario, String enderecoFuncionario, String telefoneFuncionario) {
        this.idFuncionario = idFuncionario;
        this.rmFuncionario = rmFuncionario;
        this.nomeFuncionario = nomeFuncionario;
        this.enderecoFuncionario = enderecoFuncionario;
        this.telefoneFuncionario = telefoneFuncionario;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public Integer getRmFuncionario() {
        return rmFuncionario;
    }

    public void setRmFuncionario(Integer rmFuncionario) {
        this.rmFuncionario = rmFuncionario;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public String getEnderecoFuncionario() {
        return enderecoFuncionario;
    }

    public void setEnderecoFuncionario(String enderecoFuncionario) {
        this.enderecoFuncionario = enderecoFuncionario;
    }

    public String getTelefoneFuncionario() {
        return telefoneFuncionario;
    }

    public void setTelefoneFuncionario(String telefoneFuncionario) {
        this.telefoneFuncionario = telefoneFuncionario;
    }

}
