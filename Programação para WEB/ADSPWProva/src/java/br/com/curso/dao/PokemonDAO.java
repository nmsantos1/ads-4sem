package br.com.curso.dao;

import br.com.curso.model.Pokemon;
import br.com.curso.utils.SingleConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PokemonDAO implements GenericDAO{
    
    private Connection conexao;

    public PokemonDAO() throws Exception{
        conexao = SingleConnection.getConnection();
    }
    
    @Override
    public Boolean cadastrar(Object objeto){
        Pokemon oPokemon = (Pokemon) objeto;
        Boolean retorno = false;
        if (oPokemon.getIdPokemon() == 0)
            retorno = this.inserir(oPokemon);
        else
            retorno = this.alterar(oPokemon);
        return retorno;
    }

    @Override
    public Boolean inserir(Object objeto) {
        Pokemon oPokemon = (Pokemon) objeto;
        PreparedStatement stmt = null;
        String sql = "insert into pokemon (nomepokemon) values (?)";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oPokemon.getNomePokemon());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex) {
            try{
                System.out.println("Problema ao cadastrar o Pokemon! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch (SQLException e){
                System.out.println("Erro: "+e.getMessage());
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Boolean alterar(Object objeto) {
        Pokemon oPokemon = (Pokemon) objeto;
        PreparedStatement stmt = null;
        String sql = "update pokemon set nomepokemon=? where idpokemon=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, oPokemon.getNomePokemon());
            stmt.setInt(2, oPokemon.getIdPokemon());
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception ex){
            try{
                System.out.println("Problemas ao alterar o Pokemon! Erro: "+ex.getMessage());
                ex.printStackTrace();
                conexao.rollback();
            } catch(SQLException e){
                System.out.println("Erro: "+e.getMessage());
                e.printStackTrace();
            }
            return false;
        }
    }

    @Override
    public Boolean excluir(int numero) {
        int idPokemon = numero;
        PreparedStatement stmt = null;
        String sql = "delete from pokemon where idpokemon=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idPokemon);
            stmt.execute();
            conexao.commit();
            return true;
        } catch (Exception e){
            System.out.println("Erro rollback "+e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Object carregar(int numero) {
        int idPokemon = numero;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Pokemon oPokemon = null;
        String sql = "select * from pokemon where idPokemon=?";
        try{
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, idPokemon);
            rs = stmt.executeQuery();
            while(rs.next()){
                oPokemon = new Pokemon();
                oPokemon.setIdPokemon(rs.getInt("idPokemon"));
                oPokemon.setNomePokemon(rs.getString("nomepokemon"));
            }
            return oPokemon;
        } catch (Exception ex){
            System.out.println("Problemas ao carregar Pokemon! Erro: "+ex.getMessage());
            return false;
        }
    }

    @Override
    public List<Object> listar() {
        List<Object> resultado = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "select * from pokemon order by idPokemon";
        try{
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {                
                Pokemon oPokemon = new Pokemon();
                oPokemon.setIdPokemon(rs.getInt("idPokemon"));
                oPokemon.setNomePokemon(rs.getString("nomepokemon"));
                resultado.add(oPokemon);
            }
        } catch(SQLException ex){
            System.out.println("Problemas ao listar Pokemon! Erro: "+ex.getMessage());
        }
        return resultado;
    }
   
}
