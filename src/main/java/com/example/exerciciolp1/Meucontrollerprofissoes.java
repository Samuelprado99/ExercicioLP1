package com.example.exerciciolp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Meucontrollerprofissoes {

    @FXML
    private TextField setor;

    @FXML
    private ImageView recebendosalario;

    @FXML
    private ImageView trabalhando;

    @FXML
    private TextField salario;

    @FXML
    private TextField profissao;

    @FXML
    private ImageView recebertreinamento;

    @FXML
    void btncadastar(ActionEvent event) {
    System.out.println("Cadastrando");
    }

    @FXML
    void btntrabalhar(ActionEvent event) {
    System.out.println("Voce esta Trabalhando");
    trabalhando.setVisible(true);
    recebendosalario.setVisible(false);
    recebertreinamento.setVisible(false);
    }

    @FXML
    void btnrecebersalario(ActionEvent event) {
        System.out.println("Cheio do Dinheiro");
        trabalhando.setVisible(false);
        recebendosalario.setVisible(true);
        recebertreinamento.setVisible(false);
    }

    @FXML
    void btntreinar(ActionEvent event) {
        System.out.println("Voce esta Trabalhando");
        trabalhando.setVisible(false);
        recebendosalario.setVisible(false);
        recebertreinamento.setVisible(true);
    }

}

