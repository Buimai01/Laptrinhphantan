package com.example.tuan2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BT1_Controller  {
    @FXML
    private RadioButton radioButton1;
    @FXML
    private Label cau1, cau2;
    @FXML
    private File file = new File("/home/buimai/IdeaProjects/Tuan2/src/main/java/com/example/tuan2/BT1.txt");
    public BT1_Controller() throws IOException {
        FileWriter fileWriter = new FileWriter(file);

        if (radioButton1.isSelected()) {
            fileWriter.write(radioButton1.getText() + "\n");
            fileWriter.flush();
        }else {

        }
    }
    protected void click() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Đã khảo sat thành công");
        alert.show();
    }

}
