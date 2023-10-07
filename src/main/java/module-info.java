module com.example.appfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.appfx to javafx.fxml;
    exports com.example.appfx;
}