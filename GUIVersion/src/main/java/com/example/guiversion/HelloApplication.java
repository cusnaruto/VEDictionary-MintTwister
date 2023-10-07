package com.example.guiversion;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.YELLOW);
        Image icon = new Image("C:\\Users\\cusnaruto\\Downloads\\Uni Stuffs\\OOP\\BigProject\\GUIVersion\\GUIVersion\\src\\FejwjyMVEAA5Ety.jpg");
        stage.getIcons().add(icon);
        stage.setWidth(720);
        stage.setHeight(1280);
        //stage.setFullScreen(true);
        stage.setFullScreenExitHint("suck my c-");
        stage.setResizable(false);
        stage.setTitle("chit fumo");
        stage.setScene(scene);
        stage.show();
    }
}