package com.example.exerciciolp1;

import DAO.FrutaDAO;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class Meucontrollerfruta {

 @FXML
 private ImageView frutacaindo;

 @FXML
 private ImageView frutaapodecer;

 @FXML
 private TextField peso;

 @FXML
 private TextField cor;

 @FXML
 private TextField nome;

 @FXML
 private ImageView frutamadura;

 // Instância da classe DAO para operações no banco de dados
 private FrutaDAO frutaDAO = new FrutaDAO();

 // Cadastrar a fruta no banco de dados
 @FXML
 void btncadastar(ActionEvent event) {
  String nomeFruta = nome.getText();
  String corFruta = cor.getText();
  String pesoFruta = peso.getText();

  frutaDAO.cadastrarFruta(nomeFruta, corFruta, pesoFruta);

  // Limpar campos após cadastro
  nome.setText("");
  cor.setText("");
  peso.setText("");
 }

 // Amadurecer a fruta (alterar o estado das imagens)
 @FXML
 void btnamadurecer(ActionEvent event) {
  System.out.println("Amadurecendo");
  frutamadura.setVisible(true);
  frutaapodecer.setVisible(false);
  frutacaindo.setVisible(false);
 }

 // Fazer a fruta cair (alterar o estado das imagens)
 @FXML
 void btncair(ActionEvent event) {
  System.out.println("Caindo");
  frutacaindo.setVisible(true);
  frutaapodecer.setVisible(false);
  frutamadura.setVisible(false);
 }

 // Apodrecer a fruta (alterar o estado das imagens)
 @FXML
 void btnapodrecer(ActionEvent event) {
  System.out.println("Apodrecendo");
  frutacaindo.setVisible(false);
  frutaapodecer.setVisible(true);
  frutamadura.setVisible(false);
 }
}
