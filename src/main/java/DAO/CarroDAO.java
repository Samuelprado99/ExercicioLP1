package DAO;

import com.example.exerciciolp1.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CarroDAO {

    // Cadastrar um carro
    public void cadastrarCarro(String nome, String marca, String cor) {
        String sql = "INSERT INTO carro (nome, marca, cor) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, marca);
            statement.setString(3, cor);
            statement.executeUpdate();
            System.out.println("Carro cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o carro: " + e.getMessage());
        }
    }

    // Buscar um carro por ID
    public void buscarCarro(int id) {
        String sql = "SELECT * FROM carro WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String marca = resultSet.getString("marca");
                String cor = resultSet.getString("cor");
                System.out.println("Carro encontrado: " + nome + ", Marca: " + marca + ", Cor: " + cor);
            } else {
                System.out.println("Carro não encontrado com o ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar carro: " + e.getMessage());
        }
    }

    // Atualizar um carro
    public void atualizarCarro(int id, String nome, String marca, String cor) {
        String sql = "UPDATE carro SET nome = ?, marca = ?, cor = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, marca);
            statement.setString(3, cor);
            statement.setInt(4, id);
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Carro atualizado com sucesso!");
            } else {
                System.out.println("Carro com o ID " + id + " não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar carro: " + e.getMessage());
        }
    }

    // Deletar um carro
    public void deletarCarro(int id) {
        String sql = "DELETE FROM carro WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Carro deletado com sucesso!");
            } else {
                System.out.println("Carro com o ID " + id + " não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar carro: " + e.getMessage());
        }
    }
}
