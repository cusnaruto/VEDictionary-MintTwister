package com.example.guiversion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(root);
            String css = this.getClass().getResource("/Application.css").toExternalForm();
            scene.getStylesheets().add(css);
            Image icon = new Image("C:\\Users\\cusnaruto\\Downloads\\Uni Stuffs\\OOP\\BigProject\\GUIVersion\\GUIVersion\\src\\icon.jpg");
            stage.getIcons().add(icon);
            stage.setTitle("chit fumo");
            stage.setScene(scene);
            stage.show();
        } catch(Exception e) {
        e.printStackTrace();
        }
    }
}