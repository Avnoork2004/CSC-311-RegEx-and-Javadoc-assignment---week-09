package org.example.csc311_regexandjavadoc_week_09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Loads FXML file for registration form
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Creates scene with a width and height for the registration form UI
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        scene.getStylesheets().add(HelloApplication.class.getResource("style.css").toExternalForm());

        // Sets title of the window
        stage.setTitle("Registration Form");

        // Sets scene and shows the stage
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(); // Launches JavaFX application
    }
}
