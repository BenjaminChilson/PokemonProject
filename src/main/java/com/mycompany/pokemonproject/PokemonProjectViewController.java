/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pokemonproject;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author benjaminchilson
 */
public class PokemonProjectViewController implements Initializable {
    
    int i = 0;
    
    @FXML
    private ScrollPane scrollPane;
    @FXML
    private VBox vbox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void triggerBtn(ActionEvent event) {
    }
    
    public void addPokemonToScrollPane(){
        Pane pane = new Pane();
        Label label = new Label();
        label.setText("Label" + i);
        pane.getChildren().add(label);
        vbox.getChildren().add(pane);
    }
    
}
