package DAO;

import com.example.exerciciolp1.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CachorroDAO {

    // Cadastrar um cachorro
    public void cadastrarCachorro(String nome, String raca, String peso) {
        String sql = "INSERT INTO cachorro (nome, raca, peso) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, raca);
            statement.setString(3, peso);
            statement.executeUpdate();
            System.out.println("Cachorro cadastrado com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar o cachorro: " + e.getMessage());
        }
    }

    // Buscar um cachorro por ID
    public void buscarCachorro(int id) {
        String sql = "SELECT * FROM cachorro WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String raca = resultSet.getString("raca");
                String peso = resultSet.getString("peso");
                System.out.println("Cachorro encontrado: " + nome + ", Raça: " + raca + ", Peso: " + peso);
            } else {
                System.out.println("Cachorro não encontrado com o ID " + id);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar cachorro: " + e.getMessage());
        }
    }

    // Atualizar um cachorro
    public void atualizarCachorro(int id, String nome, String raca, String peso) {
        String sql = "UPDATE cachorro SET nome = ?, raca = ?, peso = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, raca);
            statement.setString(3, peso);
            statement.setInt(4, id);
            int rowsUpdated = statement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Cachorro atualizado com sucesso!");
            } else {
                System.out.println("Cachorro com o ID " + id + " não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar cachorro: " + e.getMessage());
        }
    }

    // Deletar um cachorro
    public void deletarCachorro(int id) {
        String sql = "DELETE FROM cachorro WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsDeleted = statement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Cachorro deletado com sucesso!");
            } else {
                System.out.println("Cachorro com o ID " + id + " não encontrado.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao deletar cachorro: " + e.getMessage());
        }
    }
}
