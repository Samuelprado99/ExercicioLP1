package com.example.exerciciolp1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/exerciciolp1?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "root";

        try {
            // Garantir que o driver está carregado
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Testar conexão
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida com sucesso!");
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
