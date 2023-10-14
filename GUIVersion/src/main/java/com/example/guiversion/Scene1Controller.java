package com.example.guiversion;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


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
    private Label myTextLabel;
    @FXML
    ImageView myImageView;
    @FXML
    CheckBox checkBox;
    Button myButton;
    @FXML
    private Label myLabel = new Label();
    @FXML
    private RadioButton rButton1, rButton2;

    public void pickmap(ActionEvent event) {

        if(rButton1.isSelected()) {
            myLabel.setText(rButton1.getText());
        }
        else if(rButton2.isSelected()) {
            myLabel.setText(rButton2.getText());
        }

    }
    int age;
    Image myImage1 = new Image(getClass().getResourceAsStream("image1.jpg"));
    Image myImage2 = new Image(getClass().getResourceAsStream("image2.jpg"));
    public void displayImage() {
        myImageView.setImage(myImage2);
    }
    public void change(ActionEvent event) {
        if (checkBox.isSelected()) {
            myImageView.setImage(myImage2);
        }
        else {
            myImageView.setImage(myImage1);
        }
    }


    public void login(ActionEvent event) throws IOException {
        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        try {
            age = Integer.parseInt(ageTextField.getText());
            if (!(age >= 0 && age <= 120)) {
                myTextLabel.setText("Tuổi này hơi sai");
            }
            else {
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
        }
        catch (NumberFormatException e){
            System.out.println("Tuoi khong hop le (no la chu cai)");
            myTextLabel.setText("Hãy chỉ nhập số");
        }
        catch (Exception e) {
            System.out.println(e);
        }

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
