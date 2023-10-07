module com.example.guiversion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.guiversion to javafx.fxml;
    exports com.example.guiversion;
}