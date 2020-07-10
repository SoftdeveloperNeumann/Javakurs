package de.wbs.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;



public class FXDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Maingui.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
    }


}
