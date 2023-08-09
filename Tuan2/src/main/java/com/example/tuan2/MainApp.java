package com.example.tuan2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("student_list.fxml"));
        VBox root = loader.load();
        StudentListController controller = loader.getController();

        controller.getListView().getItems().addAll(
                new Student(1, "Loan", 20),
                new Student(2, "Loan", 20),
                new Student(3, "Loan", 20)
        );
        primaryStage.setTitle("Danh sach hoc sinh");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }
}
