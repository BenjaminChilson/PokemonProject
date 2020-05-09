/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokemonproject;

import java.util.ArrayList;

/**
 *
 * @author benjaminchilson
 */
public class PokemonTeam {
    private String teamName;
    private ArrayList<Pokemon> team;
    
    public PokemonTeam(){
        this.teamName = "Untitled";
        team = new ArrayList<Pokemon>();
    }
    
    public String getTeamName(){
        return this.teamName;
    }
    
    public void addPokemon(){
        if (team.size() < 6){
            //Pokemon newPokemon = promptPokemonSearch();
            //team.add(newPokemon);
        }
    }
}
