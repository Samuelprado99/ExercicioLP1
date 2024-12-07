package com.example.exerciciolp1;

import DAO.ProfissaoDAO;
import javafx.application.Application;
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

    // Instância da classe DAO para operações no banco de dados
    private ProfissaoDAO profissaoDAO = new ProfissaoDAO();

    // Cadastrar a profissão no banco de dados
    @FXML
    void btncadastar(ActionEvent event) {
        String nomeProfissao = profissao.getText();
        String salarioProfissao = salario.getText();
        String setorProfissao = setor.getText();

        profissaoDAO.cadastrarProfissao(nomeProfissao, salarioProfissao, setorProfissao);

        // Limpar campos após cadastro
        profissao.setText("");
        salario.setText("");
        setor.setText("");
    }

    // Trabalhar (alterar o estado das imagens)
    @FXML
    void btntrabalhar(ActionEvent event) {
        System.out.println("Você está trabalhando");
        trabalhando.setVisible(true);
        recebendosalario.setVisible(false);
        recebertreinamento.setVisible(false);
    }

    // Receber salário (alterar o estado das imagens)
    @FXML
    void btnrecebersalario(ActionEvent event) {
        System.out.println("Recebendo salário");
        trabalhando.setVisible(false);
        recebendosalario.setVisible(true);
        recebertreinamento.setVisible(false);
    }

    // Receber treinamento (alterar o estado das imagens)
    @FXML
    void btntreinar(ActionEvent event) {
        System.out.println("Recebendo treinamento");
        trabalhando.setVisible(false);
        recebendosalario.setVisible(false);
        recebertreinamento.setVisible(true);
    }
}
