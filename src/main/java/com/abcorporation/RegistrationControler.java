package com.abcorporation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegistrationControler {

	@FXML
	private TextField fName;
	@FXML
	private TextField lName;


	@FXML
	private TextField telephoneNo;

	@FXML
	private PasswordField password1;

	@FXML
	private PasswordField password2;

	@FXML
	private TextArea deliveryAddress;

	@FXML
	private Button saveUserBtn;

	@FXML
	private Button exitBtn;

	@FXML
	private ChoiceBox<?> category;

	@FXML
	private Button backToLoginBtn;
	@FXML
	private Label responseLbl;

	@FXML
	void backToLoginBtnClicked(ActionEvent event) throws IOException
	{
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
		Stage newStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
		Scene scene = new Scene(root);
		newStage.setTitle("Login Page!");
		newStage.setScene(scene);
		newStage.show();

	}

	@FXML
	void exitBtnClicked(ActionEvent event)
	{
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
	}

	@FXML
	void saveUserBtnClicked(ActionEvent event)
	{
		if (password1.getText().isEmpty() || password2.getText().isEmpty() || fName.getText().isEmpty() || lName.getText().isEmpty() || telephoneNo.getText().isEmpty() || deliveryAddress.getText().isEmpty() || category.getSelectionModel().getSelectedItem().toString().isEmpty())
		{
			responseLbl.setText("Please fill in all fields!");
		}
		else if (!password1.equals(password2))
		{
			responseLbl.setText("Passwords do not match!");
		}
	}

}
