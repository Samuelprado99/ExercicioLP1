package com.example.exerciciolp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class MeuControllercachorro {

    @FXML
    private ImageView latindo;
    @FXML
    private ImageView dancando;
    @FXML
    private ImageView correndo;

    @FXML
    private TextField peso;

    @FXML
    private TextField raca;

    @FXML
    private TextField Nome;

    @FXML
    void btncadastar(ActionEvent event) {
        System.out.println("Cachorro cadastrado.");
        peso.setText("");
        raca.setText("");
        Nome.setText("");
    }

    @FXML
    void btncorrer(ActionEvent event) {
        System.out.println("O cachorro está correndo.");
        correndo.setVisible(true);
        latindo.setVisible(false);
        dancando.setVisible(false);
    }

    @FXML
    void btnlatir(ActionEvent event) {
        System.out.println("O cachorro está latindo.");
        latindo.setVisible(true);
        dancando.setVisible(false);
        correndo.setVisible(false);
    }

    @FXML
    void btndancar(ActionEvent event) {
        System.out.println("O cachorro está dançando.");
        dancando.setVisible(true);
        latindo.setVisible(false);
        correndo.setVisible(false);
    }

}





