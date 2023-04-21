package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
private TextField TF1;

    @FXML
    protected void plis() {
        if (Integer.parseInt(TF1.getText())<3){
        TF1.setText(Integer.toString(Integer.parseInt(TF1.getText())+1));}
    }
    @FXML
    protected void Minys() {
        if (Integer.parseInt(TF1.getText())>-5){
        TF1.setText(Integer.toString(Integer.parseInt(TF1.getText())-1));}
    }
}