package br.com.curso.model;

public class Pokemon {
    
    private int idPokemon;
    private String nomePokemon;

    public Pokemon() {
        this.idPokemon = 0;
        this.nomePokemon = "";
    }

    public int getIdPokemon() {
        return idPokemon;
    }

    public void setIdPokemon(int idPokemon) {
        this.idPokemon = idPokemon;
    }

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }
    
    
}

