/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokemonproject;

/**
 *
 * @author benjaminchilson
 */
public class Pokemon {
    String name;
    String type;
    String[] moves;
    String nickname;
    
    public Pokemon(String name, String type){
        this.name = name;
        this.type = type;
        this.nickname = name;
    }
    
    Pokemon(String name, String type, String nickname){
        this(name, type);
        this.nickname = nickname;
    }

}
