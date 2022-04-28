package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private int c = 0;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML

    protected void counter() {


        c+=1;
        welcomeText.setText("punteggio:"+c);
    }
    @FXML
    protected void counterminus() {


        c-=1;
        welcomeText.setText("punteggio:"+c);
    }
}