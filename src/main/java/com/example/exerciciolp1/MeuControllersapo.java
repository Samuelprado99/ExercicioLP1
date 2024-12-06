package com.example.exerciciolp1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;


public class MeuControllersapo {

    @FXML
    private TextField nome;

    @FXML
    private TextField especie;

    @FXML
    private TextField tamanho;

    @FXML
    private ImageView sapoComendo;

    @FXML
    private ImageView sapoPulando;

    @FXML
    private ImageView sapoCoaxando;

    @FXML
    void btnCadastrar(ActionEvent event) {
        System.out.println("Sapo cadastrado: Nome = " + nome.getText() + ", Cor = " + especie.getText() + ", Tamanho = " + tamanho.getText());
        nome.setText("");
        especie.setText("");
        tamanho.setText("");
    }

    @FXML
    void btnPular(ActionEvent event) {
        System.out.println("O sapo está pulando.");
        sapoPulando.setVisible(true);
        sapoComendo.setVisible(false);
        sapoCoaxando.setVisible(false);
    }

    @FXML
    void btnCoaxar(ActionEvent event) {
        System.out.println("O sapo está coaxando.");
        sapoCoaxando.setVisible(true);
        sapoComendo.setVisible(false);
        sapoPulando.setVisible(false);
    }

    @FXML
    void btnComerInseto(ActionEvent event) {
        System.out.println("O sapo está comendo inseto.");
        sapoComendo.setVisible(true);
        sapoPulando.setVisible(false);
        sapoCoaxando.setVisible(false);
    }
}
