/*
Last Modified: April 25, 2021 11:41 pm by Cedrick James Felicitas 

*/



package sample;


// importing some various shits 
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;



public class FXMLDocumentController implements Initializable {

    // This list will be the one that will hold the values or data that has been enetered by the user
    // Warning: Please do not delete this one 
    private static ObservableList<Patient> list = FXCollections.observableArrayList();

    @FXML
    private Label label;
    @FXML
    private TableView<Patient> table;  // the "Patient" class has been inserted in this tableview so that the data of the patients will be displayed
    @FXML
    private TableColumn<Patient, String> Name; // the column "Name" in the tableview will fetch the variable "name" in the "Patient" class.
    @FXML
    private TableColumn<Patient, String> Age; // the column "Age" in the tableview will fetch the variable "age" in the "Patient" class.
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtAge;
    /*
    The method "submitData" will perform an submit action or create action that will send data into the observableList.
    this method is bounded or linked to the button Submit in the FXMLDocument.fxml
    */
      @FXML
    void submitData(ActionEvent event) {
        /*the "list.add" will perform an action that will catch the input from the 
        the textfield that is named "txtName" and the textfie;d that has a name "txtAge"*/
        
        list.add(new Patient(txtName.getText(),txtAge.getText()));
        /*The code  .setText("") is used for clearing the inputs from the textfield
        after submitting the data 
        */
        
        txtName.setText("");
        txtAge.setText("");
/* the alert message will send an information tha the data has been submitted so that 
the it wont have any repitions of submitting the data mistakenly 
*/ 
Alert Message = new Alert(AlertType.INFORMATION);
Message.setContentText("A patient has been added");
Message.show();
    }
    
/*This method will perform an action that will update the table */    
    @FXML
    void UpdateData(ActionEvent event) {
table.setItems(list);
    }

// Code hasn't been coded yet
    @FXML
    void DeleteData(ActionEvent event) {

    }
    
    // idk what the hell is this for but I just saw it on youtube so yea
   @Override
    public void initialize(URL location, ResourceBundle resources) {
        Name.setCellValueFactory(new PropertyValueFactory<Patient,String>("namePatient"));
            Age.setCellValueFactory(new PropertyValueFactory<Patient,String>("agePatient"));
    

    }
    
    

}
