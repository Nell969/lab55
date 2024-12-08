module com.example.lab555 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab555 to javafx.fxml;
    exports com.example.lab555;
}