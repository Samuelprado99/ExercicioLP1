package DAO;

import com.example.exerciciolp1.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FrutaDAO {

    // Cadastrar uma fruta
    public void cadastrarFruta(String nome, String cor, String peso) {
        String sql = "INSERT INTO fruta (nome, cor, peso) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, cor);
            statement.setString(3, peso);
            statement.executeUpdate();
            System.out.println("Fruta cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar a fruta: " + e.getMessage());
        }
    }

    // Buscar uma fruta por ID
    public void buscarFruta(int id) {
        String sql = "SELECT * FROM fruta WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String nome = resultSet.getString("nome");
                String cor = resultSet.getString("cor");
                String peso = resultSet.getString("peso");
                System.out.println("Fruta encontrada: " + nome + ", " + cor + ", " + peso);
            } else {
                System.out.println("Fruta não encontrada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar a fruta: " + e.getMessage());
        }
    }

    // Atualizar uma fruta
    public void atualizarFruta(int id, String nome, String cor, String peso) {
        String sql = "UPDATE fruta SET nome = ?, cor = ?, peso = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, nome);
            statement.setString(2, cor);
            statement.setString(3, peso);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.out.println("Fruta atualizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar a fruta: " + e.getMessage());
        }
    }

    // Deletar uma fruta
    public void deletarFruta(int id) {
        String sql = "DELETE FROM fruta WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Fruta deletada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar a fruta: " + e.getMessage());
        }
    }
}
