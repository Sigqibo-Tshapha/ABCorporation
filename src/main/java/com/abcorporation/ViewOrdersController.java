package com.abcorporation;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.ContextMenuEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewOrdersController {

	@FXML
	private TableView<?> customerTbl;

	@FXML
	private TableView<?> ordersTbl;

	@FXML
	private Button newOrderBtn;

	@FXML
	private Button exitBtn;

	@FXML
	void customerTblSort(ActionEvent event) {

	}

	@FXML
	void newOrderBtnClicked(ActionEvent event) throws IOException
	{
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
		Stage newStage = new Stage();
		Parent root = FXMLLoader.load(getClass().getResource("newOrder.fxml"));
		Scene scene = new Scene(root);
		newStage.setTitle("Make New Order!");
		newStage.setScene(scene);
		newStage.show();
	}


	@FXML
	void exitBtnClicked(ActionEvent event) {
		Stage stage = (Stage) exitBtn.getScene().getWindow();
		stage.close();
	}
	@FXML
	void ordersTblLoader(ContextMenuEvent event) {

	}

}
