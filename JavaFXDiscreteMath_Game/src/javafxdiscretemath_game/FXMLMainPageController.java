/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdiscretemath_game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Marlo Barua
 */
public class FXMLMainPageController implements Initializable {

    @FXML
    private TextField txtAnswer1;
    @FXML
    private TextField txtAnswer2;
    @FXML
    private TextField txtAnswer3;
    @FXML
    private TextField txtAnswer4;
    @FXML
    private TextField txtAnswer5;
    @FXML
    private Label lblCheck1;
    @FXML
    private Label lblCheck2;
    @FXML
    private Label lblCheck3;
    @FXML
    private Label lblCheck4;
    @FXML
    private Label lblCheck5;
    @FXML
    private Button btnSubmit;
    
    @FXML
    private Label txtTrue;
    
    @FXML
    private Label txtFalse;

    @FXML
    private void handleButtonAction(ActionEvent event)  {
        
        

        int trueResult = 0;
        int falseResult = 0;
        boolean ting = true;
        boolean engk = false;
        
        //Question no.1
        String answer1 = "18";
        String answer2 = "30";
        String answer3a = "2";
        String answer3b = "3";
        String answer4a = "2";
        String answer4b = "4";
        String answer5 = "77";
        
        if(txtAnswer1.getText().equals(answer1)){
                if(answer1 == "18"){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
                
            lblCheck1.setText("True");
        }
        else{
            lblCheck1.setText("False");
            System.out.println(engk);
            falseResult = falseResult + 1;
            
            
            
        }
        //Question no.2
        if(txtAnswer2.getText().equals(answer2)){
             if(answer2 == "30"){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }
         lblCheck2.setText("True");
        }
        else{
            lblCheck2.setText("False");
             System.out.println(engk);
             falseResult = falseResult + 1;
        }
                               
        //Question no.3
        if(txtAnswer3.getText().equals(answer3a + ", " + answer3b)){
             if(answer3a == "2" || answer3b == "3"){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }          
            lblCheck3.setText("True");
        }
        else{
            lblCheck3.setText("False");
             System.out.println(engk);
             falseResult = falseResult + 1;            
        }
        //Question no.4
        if(txtAnswer4.getText().equals(answer4a)){
             if(answer4a == "2"){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }         
            lblCheck4.setText("True");
        }
        else if(txtAnswer4.getText().equals(answer4b)){
             if(answer4b == "4"){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }         
            lblCheck4.setText("True");
        }        
        else{
            lblCheck4.setText("False");
             System.out.println(engk);
             falseResult = falseResult + 1;                  
        }
        //Question no.5
        if(txtAnswer5.getText().equals(answer5)){
             if(answer5 == "77"){
                    System.out.println(ting);
                    trueResult = trueResult + 1;
                }          
            lblCheck5.setText("True");
        }
        else{
            lblCheck5.setText("False");
             System.out.println(engk);
             falseResult = falseResult + 1;                  
        }        
        
        
        System.out.println();
        System.out.println("The Correct answers you got are " + trueResult );
        System.out.println("The Wrong answers you got are " + falseResult);     
        System.out.println();
        
        String allTrue = Integer.toString(trueResult);
        String allFalse = Integer.toString(falseResult);
        
        txtTrue.setText(allTrue);
        txtFalse.setText(allFalse);
        
    }
    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
}
