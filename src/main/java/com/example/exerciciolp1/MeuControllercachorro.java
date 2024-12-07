package com.example.exerciciolp1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
        String nomeCachorro = Nome.getText();
        String racaCachorro = raca.getText();
        String pesoCachorro = peso.getText();

        String sql = "INSERT INTO cachorro (nome, raca, peso) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nomeCachorro);
            statement.setString(2, racaCachorro);
            statement.setString(3, pesoCachorro);
            statement.executeUpdate();

            System.out.println("Cachorro cadastrado com sucesso!");

            // Limpa os campos após a inserção
            peso.setText("");
            raca.setText("");
            Nome.setText("");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o cachorro: " + e.getMessage());
        }
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
