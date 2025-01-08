package com.example.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

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

//      Opción 2: Desde la plantilla de Java FX. Hau gomendagarriagoa da vista eta logika banantzeko
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        HelloController hc = fxmlLoader.getController();

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setWidth(bounds.getWidth());
        stage.setHeight(bounds.getHeight());
        stage.setMaximized(true);

        hc.setStage(stage);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    public static void dbConnectionExample() {

        // Variables de conexión
        String url = "jdbc:mysql://localhost:3306/da_2entrega"; // Cambia "tu_base_de_datos" por el nombre de tu BD
        String user = "root"; // Cambia "tu_usuario" por tu usuario de MySQL
        String password = ""; // Cambia "tu_contraseña" por tu contraseña de MySQL

        // Conexión a la base de datos
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión exitosa a la base de datos.");

            // Consulta SQL
            String query = "SELECT nan, izena, abizena FROM langilea"; // Cambia "usuarios" por el nombre de tu tabla

            // Preparar la sentencia
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                // Ejecutar la consulta
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    // Procesar los resultados
                    while (resultSet.next()) {
                        int nan = resultSet.getInt("nan");
                        String izena = resultSet.getString("izena");
                        String abizena = resultSet.getString("abizena");

                        // Mostrar los datos
                        System.out.println("nan: " + nan + ", izena: " + izena + ", abizena: " + abizena);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en la conexión o la consulta.");
            e.printStackTrace();
        }
    }


    public void froga() {
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
    }
}