package com.example.exerciciolp1;

import DAO.CarroDAO;
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

    // Instanciando o CarroDAO para realizar as operações CRUD
    private CarroDAO carroDAO = new CarroDAO();

    // Método para cadastrar um carro
    @FXML
    void btncadastar(ActionEvent event) {
        String nome = nomecarro.getText();
        String marca = marcacarro.getText();
        String cor = corcarro.getText();

        // Chamando o método de cadastro do CarroDAO
        carroDAO.cadastrarCarro(nome, marca, cor);

        // Limpar os campos após o cadastro
        nomecarro.setText("");
        marcacarro.setText("");
        corcarro.setText("");
    }

    // Método para ligar o carro
    @FXML
    void btnligar(ActionEvent event) {
        System.out.println("Ligar do carro");
        carroligando.setVisible(true);
        carrodesliga.setVisible(false);
        carroacelerando.setVisible(false);
    }

    // Método para desligar o carro
    @FXML
    void btndesligar(ActionEvent event) {
        System.out.println("Desligar do carro");
        carroligando.setVisible(false);
        carrodesliga.setVisible(true);
        carroacelerando.setVisible(false);
    }

    // Método para acelerar o carro
    @FXML
    void btnacelerar(ActionEvent event) {
        System.out.println("Acelerar do carro");
        carrodesliga.setVisible(false);
        carroacelerando.setVisible(true);
        carroligando.setVisible(false);
    }

}
