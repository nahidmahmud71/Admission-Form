package com.sslwireless.form;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FormController implements Initializable {

    @FXML
    public CheckBox agreeCheckBox;

    @FXML
    public TextArea bioTextArea;

    @FXML
    public ToggleGroup genderToggle;

    @FXML
    public TextField nameTextField;

    @FXML
    public PasswordField passwordField;

    @FXML
    private ChoiceBox<String> programChoiceBox;

    @FXML
    void saveEvent(ActionEvent event) {
        String name = nameTextField.getText();
        String bio = bioTextArea.getText();
        String password = passwordField.getText();
        boolean agree = agreeCheckBox.isSelected();
        String  program = programChoiceBox.getValue();

        IO.println(name + " " + bio + " " + password + " " + agree);

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        IO.println(" Automatic i am called ");
        ObservableList<String> programList = FXCollections.observableArrayList();
        programList.add(" CSE ");
        programList.add(" EEE ");
        programList.add(" BBA ");

        programChoiceBox.setItems(programList);

    }
}
