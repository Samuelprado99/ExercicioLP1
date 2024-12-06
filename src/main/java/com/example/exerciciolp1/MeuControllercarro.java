package com.example.exerciciolp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MeuControllercarro {

    @FXML
    private ImageView carrodesliga;

    @FXML
    private TextField nomecarro;

    @FXML
    private ImageView carroligando;

    @FXML
    private TextField corcarro;

    @FXML
    private TextField marcacarro;

    @FXML
    private ImageView carroacelerando;

    @FXML
    void btncadastar(ActionEvent event) {
   System.out.println("Cadastro do carro");
    }

    @FXML
    void btnligar(ActionEvent event) {
 System.out.println("Ligar do carro");
   carroligando.setVisible(true);
   carrodesliga.setVisible(false);
   carroacelerando.setVisible(false);
    }

    @FXML
    void btndesligar(ActionEvent event) {
    System.out.println("Desligar do carro");
    carroligando.setVisible(false);
    carrodesliga.setVisible(true);
    carroacelerando.setVisible(false);
    }

    @FXML
    void btnacelerar(ActionEvent event) {
   System.out.println("Acelerar do carro");
   carrodesliga.setVisible(false);
   carroacelerando.setVisible(true);
   carroligando.setVisible(false);
    }

}
