/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Marlo Barua
 */
public class FXMLQuestionController implements Initializable {
    
    @FXML
    private TextField txtAnswer;

    @FXML
    private Button button;
 

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        if(txtAnswer.getText(). equals("18")){
            
          Alert Message = new Alert(Alert.AlertType.INFORMATION);
        Message.setContentText("Your answer is correct");
        Message.show();          
            
            
                            Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLQuestion1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
            
        }
        
        else{
            
                      Alert Message = new Alert(Alert.AlertType.INFORMATION);
        Message.setContentText("Your answer is incorrect");
        Message.show();          
            
            
                            Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("FXMLQuestion1.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
            
        }
        
        
        

    }
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
}
