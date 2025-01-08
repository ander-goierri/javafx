package com.example.javafx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController extends BaseController {
    @FXML
    private Label welcomeText;
    @FXML
    private Label secondText;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        try {
            welcomeText.setText("Welcome to JavaFX Application!");
            secondText.setText("Welcome to JavaFX Application!");

            FXMLLoader fxmlLoader = new FXMLLoader(StudentApplication.class.getResource("hasieraMenua.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 320, 240);
            usedStage.setTitle("Students");
            usedStage.setScene(scene);
            usedStage.show();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}