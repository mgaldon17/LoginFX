package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import map.Database;

public class MainController {
	
	@FXML
	private Label lblStatus;
	
	@FXML
	private TextField userTxt;
	
	@FXML
	private TextField passTxt;
	
	
	public void Login(ActionEvent event) {		
		
		if(userTxt.getText().equals("user") && passTxt.getText().equals("pass")) {
			
			System.out.println("Login successful");
			
			lblStatus.setText("Login OK");
			
		}else{
			
			System.out.println("User or pass invalid");
			
			lblStatus.setText("Login NOT OK");
		}
	}
	
	
	
	

}
