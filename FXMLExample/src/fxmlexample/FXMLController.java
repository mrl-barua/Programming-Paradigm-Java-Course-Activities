/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fxmlexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Marlo Barua
 */
public class FXMLController implements Initializable {

@FXML
private Label lblStatus;

@FXML
private TextField txtUsername;

@FXML
private TextField txtPassword;

@FXML
private void handleButtonAction(ActionEvent event) {
    if(txtUsername.getText().equals("admin")&& txtPassword.getText().equals("adminPass")){
        lblStatus.setText("Successful");
    }
    else{
        lblStatus.setText("failed");
    }
        
}
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
