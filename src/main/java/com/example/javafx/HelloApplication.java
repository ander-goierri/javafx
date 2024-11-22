package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void init() throws Exception {
        super.init();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
    }

    @Override
    public void start(Stage stage) throws IOException {
        //Opción 1: Crear todas la etiquetas desde JAVA
//        Label label = new Label("Enter your name:");
//        TextField textField = new TextField();
//        Button sayHelloButton = new Button("Say Hello");
//        Button exitButton = new Button("Exit");
//        Label message = new Label();
//        message.setStyle("-fx-text-fill: blue; -fx-alignment: right");
//
//        sayHelloButton.setOnAction(event -> {
//            String name = textField.getText();
//            if(!name.trim().isEmpty()){
//                message.setText("Hello " + name + "!");
//                textField.clear();
//            } else {
//                message.setText("Hello!");
//            }
//        });
//
//        exitButton.setOnAction(event -> {
//            stage.close();
//        });
//
//        VBox root = new VBox();
//        root.setSpacing(5);
//        root.getChildren().addAll(label, textField, message, sayHelloButton, exitButton);
//        Scene scene = new Scene(root, 350, 150);
//        stage.setScene(scene);
//        stage.show();


//      Opción 2: Desde la plantilla de Java FX. Hau gomendagarriagoa da vista eta logika banantzeko
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}