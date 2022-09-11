package com.abcorporation;

import com.summativeassessment3.activity2.Customer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController
{
	@FXML
	private TextField userIdInput;
	@FXML
	private PasswordField passwordInput;
	@FXML
	private Button loginBtn;
	@FXML
	private Button registerBtn;
	@FXML
	private Label responseTxt;
	@FXML
	private Button exitBtn;

	public void registerBtnClicked(ActionEvent e) throws IOException
	{
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
		Stage newStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("newCustomer.fxml"));
		Scene scene = new Scene(root);
		stage.setTitle("Registration Page!");
		stage.setScene(scene);
		stage.show();

	}
	public void loginBtnClicked(ActionEvent e)
	{
		responseTxt.setTextFill(Color.RED);
		if(passwordInput.getText().isEmpty())
		{
			responseTxt.setText("Invalid Password!");
		}
		else if(userIdInput.getText().isEmpty())
		{
			responseTxt.setText("Invalid userId!");
		}
		else
			responseTxt.setText("login successful");

	}

	public void exitBtnClicked(ActionEvent e)
	{
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
	}
}