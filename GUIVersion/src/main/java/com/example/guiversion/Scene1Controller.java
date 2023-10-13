package com.example.guiversion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Scene1Controller {
    @FXML
    TextField ageTextField;
    private Stage stage;
    private Scene scene;
    private Parent root;
    private Button logoutButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    ImageView myImageView;
    Button myButton;
    Image myImage = new Image(getClass().getResourceAsStream("image2.jpg"));
    public void displayImage() {
        myImageView.setImage(myImage);
    }


    public void login(ActionEvent event) throws IOException {
        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));

        String age = ageTextField.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();
        Scene2Controller scene2Controller = loader.getController();
        scene2Controller.displayName(age);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent e) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Thoát?");
        alert.setHeaderText("Muốn thoát sao homie?");
        alert.setContentText("Muốn save không homie?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            System.out.println("le logout had arrived");
            stage.close();
        }

    }
}
