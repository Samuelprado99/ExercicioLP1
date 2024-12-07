package DAO;

import com.example.exerciciolp1.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfissaoDAO {

    // Cadastrar uma nova profissão
    public void cadastrarProfissao(String profissao, String salario, String setor) {
        String sql = "INSERT INTO profissoes (profissao, salario, setor) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, profissao);
            statement.setString(2, salario);
            statement.setString(3, setor);
            statement.executeUpdate();
            System.out.println("Profissão cadastrada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar profissão: " + e.getMessage());
        }
    }

    // Buscar profissão por ID
    public void buscarProfissao(int id) {
        String sql = "SELECT * FROM profissoes WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String profissao = resultSet.getString("profissao");
                String salario = resultSet.getString("salario");
                String setor = resultSet.getString("setor");
                System.out.println("Profissão encontrada: " + profissao + ", " + salario + ", " + setor);
            } else {
                System.out.println("Profissão não encontrada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar profissão: " + e.getMessage());
        }
    }

    // Atualizar profissão
    public void atualizarProfissao(int id, String profissao, String salario, String setor) {
        String sql = "UPDATE profissoes SET profissao = ?, salario = ?, setor = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, profissao);
            statement.setString(2, salario);
            statement.setString(3, setor);
            statement.setInt(4, id);
            statement.executeUpdate();
            System.out.println("Profissão atualizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar profissão: " + e.getMessage());
        }
    }

    // Deletar profissão
    public void deletarProfissao(int id) {
        String sql = "DELETE FROM profissoes WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Profissão deletada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao deletar profissão: " + e.getMessage());
        }
    }
}
