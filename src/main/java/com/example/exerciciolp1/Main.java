package com.example.exerciciolp1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("TelaCachorro.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        primaryStage.setTitle("Cadastro de Cachorros");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Testa a conexão com o banco de dados ao iniciar o programa
        testarConexao();
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Método para testar a conexão com o banco de dados
    private void testarConexao() {
        String url = "jdbc:mysql://localhost:3306/exerciciolp1";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            if (connection != null) {
                System.out.println("Conexão estabelecida com sucesso!");
                System.out.println("Banco de dados conectado: " + connection.getCatalog());
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
