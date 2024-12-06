package com.example.exerciciolp1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

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

        @FXML
        void btncadastar(ActionEvent event) {
         System.out.println("Cadastrado");
         nome.setText("");
         cor.setText("");
         peso.setText("");
        }


        @FXML
        void btnamadurecer(ActionEvent event) {
        System.out.println("Amadurecendo");
        frutamadura.setVisible(true);
        frutaapodecer.setVisible(false);
        frutacaindo.setVisible(false);
        }

        @FXML
        void btncair(ActionEvent event) {
         System.out.println("Caindo");
         frutacaindo.setVisible(true);
         frutaapodecer.setVisible(false);
         frutacaindo.setVisible(false);
        }

        @FXML
        void btnapodrecer(ActionEvent event) {
        System.out.println("Apodrecendo");
         frutacaindo.setVisible(false);
         frutaapodecer.setVisible(true);
         frutacaindo.setVisible(false);
        }

    


}
