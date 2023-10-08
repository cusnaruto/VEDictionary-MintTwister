package com.example.guiversion;

import javafx.application.Application;
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
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.SLATEBLUE);
        Image icon = new Image("C:\\Users\\cusnaruto\\Downloads\\Uni Stuffs\\OOP\\BigProject\\GUIVersion\\GUIVersion\\src\\FejwjyMVEAA5Ety.jpg");
        Text text = new Text();
        text.setText("fumo");
        text.setX(400);
        text.setY(300);
        text.setFont(Font.font("Comic sans MS",50));
        text.setFill(Color.YELLOW);
        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(500);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        Image image = new Image("C:\\Users\\cusnaruto\\Downloads\\Uni Stuffs\\OOP\\BigProject\\GUIVersion\\GUIVersion\\src\\gura.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(0);
        imageView.setY(0);
        root.getChildren().add(imageView);
        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.getIcons().add(icon);
        //stage.setWidth(720);
        //stage.setHeight(1280);
        //stage.setFullScreen(true);
        stage.setFullScreenExitHint("suck my c-");
        stage.setResizable(false);
        stage.setTitle("chit fumo");
        stage.setScene(scene);
        stage.show();
    }
}