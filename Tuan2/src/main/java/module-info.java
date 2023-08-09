module Tuan2 {
    requires javafx.fxml;
    requires javafx.controls;

    opens com.example.tuan2 to javafx.fxml;
    exports com.example.tuan2;
}