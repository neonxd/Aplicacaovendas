package com.vendas.gui;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author aluno
 */
public class PainelDeControleController implements Initializable {

     @FXML
    private Button btnInserefuncionario;

    @FXML
    private Button btnInsereProduto;

    @FXML
    void Inserefuncionario(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Inserefuncionario.fxml"));
        
        PainelControle painelControle = new PainelControle();
        
        InsereFuncionario inserefuncionario = new InsereFuncionario();
    }

    @FXML
    void Insereproduto(ActionEvent event) {

    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
