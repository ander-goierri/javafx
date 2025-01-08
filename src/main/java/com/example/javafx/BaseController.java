package com.example.javafx;

import javafx.stage.Stage;

public class BaseController {

    protected Stage usedStage;

    public Stage getStage() {
        return usedStage;
    }

    public void setStage(Stage usedStage) {
        this.usedStage = usedStage;
    }

}
