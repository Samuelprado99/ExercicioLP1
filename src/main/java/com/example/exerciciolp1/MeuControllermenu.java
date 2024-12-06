package com.example.exerciciolp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MeuControllermenu {

    @FXML
    void btncachorro(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da tela do cachorro
            Parent telaCachorroParent = FXMLLoader.load(getClass().getResource("TelaCachorro.fxml"));

            // Cria uma nova cena com o conteúdo carregado
            Scene telaCachorroScene = new Scene(telaCachorroParent);

            // Obtém o Stage atual através do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Define a nova cena no stage
            window.setScene(telaCachorroScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btncarro(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da tela do cachorro
            Parent telaCachorroParent = FXMLLoader.load(getClass().getResource("Telacarro.fxml"));

            // Cria uma nova cena com o conteúdo carregado
            Scene telaCachorroScene = new Scene(telaCachorroParent);

            // Obtém o Stage atual através do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Define a nova cena no stage
            window.setScene(telaCachorroScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnsapo(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da tela do cachorro
            Parent telaCachorroParent = FXMLLoader.load(getClass().getResource("Telasapo.fxml"));

            // Cria uma nova cena com o conteúdo carregado
            Scene telaCachorroScene = new Scene(telaCachorroParent);

            // Obtém o Stage atual através do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Define a nova cena no stage
            window.setScene(telaCachorroScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnprofissoes(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da tela do cachorro
            Parent telaCachorroParent = FXMLLoader.load(getClass().getResource("Telaprofissoes.fxml"));

            // Cria uma nova cena com o conteúdo carregado
            Scene telaCachorroScene = new Scene(telaCachorroParent);

            // Obtém o Stage atual através do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Define a nova cena no stage
            window.setScene(telaCachorroScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btnfruta(ActionEvent event) {
        try {
            // Carrega o arquivo FXML da tela do cachorro
            Parent telaCachorroParent = FXMLLoader.load(getClass().getResource("Telafruta.fxml"));

            // Cria uma nova cena com o conteúdo carregado
            Scene telaCachorroScene = new Scene(telaCachorroParent);

            // Obtém o Stage atual através do evento
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Define a nova cena no stage
            window.setScene(telaCachorroScene);
            window.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void btncasa(ActionEvent event) {
        // Ação para o botão casa
    }

    @FXML
    void btncobra(ActionEvent event) {
        // Ação para o botão cobra
    }

    @FXML
    void btnplanta(ActionEvent event) {
        // Ação para o botão planta
    }

    @FXML
    void btnrefrigerante(ActionEvent event) {
        // Ação para o botão refrigerante
    }

    @FXML
    void btnpessoas(ActionEvent event) {
        // Ação para o botão pessoas
    }
}
