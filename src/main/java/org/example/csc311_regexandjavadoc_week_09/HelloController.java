package org.example.csc311_regexandjavadoc_week_09;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Button addButton;

    @FXML
    private TextField dobField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private Label validationMessage;

    @FXML
    private TextField zipField;

    @FXML
    void onHelloButtonClick(ActionEvent event) {

    }

}