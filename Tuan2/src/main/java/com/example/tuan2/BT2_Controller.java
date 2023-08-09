package com.example.tuan2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class BT2_Controller {
    @FXML
    private RadioButton radioButton3, radioButton8;
    @FXML
    private Label bai1, bai2;
    @FXML
    protected void click() {
        if (radioButton3.isSelected()){
            bai1.setText("Đúng");
        }else {
            bai1.setText("Sai");
        }
        if (radioButton8.isSelected()){
            bai2.setText("Đúng");
        }else {
            bai2.setText("Sai");
        }
    }

}
