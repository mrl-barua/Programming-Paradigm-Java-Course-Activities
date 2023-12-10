/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurants;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Marlo Barua
 */
public class FXMLlogInController implements Initializable {
    
    
    @FXML
    private Label lblStatus;
    
    @FXML
    private TextField txtUsername;
    
    @FXML
    private TextField txtPassword;
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
       if(txtUsername.getText().equals("admin")&& txtPassword.getText().equals("useradmin"))
       {
           lblStatus.setText("Succesful");
         
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLMain.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
         
           
       }
       else
       {
           lblStatus.setText("Failed");           
       }

    }
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
