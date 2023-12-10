/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurants;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Marlo Barua
 */
public class FXMLMainController implements Initializable {
    
  private static ObservableList<Tableview> list = FXCollections.observableArrayList();

    @FXML
    private TextField txtID;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtLocation;
    @FXML
    private TextField txtShares;
    @FXML
    private TextField txtUnits;
    @FXML
    private TableView<Tableview> tvRestaurant;
    @FXML
    private TableColumn<Tableview, String> colID;
    @FXML
    private TableColumn<Tableview, String> colName;
    @FXML
    private TableColumn<Tableview, String> colLocation;
    @FXML
    private TableColumn<Tableview, String> colShares;
    @FXML
    private TableColumn<Tableview, String> colUnits;
    @FXML
    private Button btnInsert;
    @FXML
    private Button btnUpdate;
    @FXML
    private Button btnDelete;

    @FXML 
    void btnInsert(ActionEvent event){
                    /*the "list.add" will perform an action that will catch the input from the 
        the textfield that is named "txtName" and the textfie;d that has a name "txtAge"*/
        
        list.add(new Tableview(txtID.getText(),txtName.getText(),txtLocation.getText(),txtShares.getText(),txtUnits.getText()));
        /*The code  .setText("") is used for clearing the inputs from the textfield
        after submitting the data 
        */
        
        txtID.setText("");
        txtName.setText("");
        txtLocation.setText("");
        txtShares.setText("");
        txtUnits.setText("");     
        
/* the alert message will send an information tha the data has been submitted so that 
the it wont have any repitions of submitting the data mistakenly 
*/ 
        Alert Message = new Alert(Alert.AlertType.INFORMATION);
        Message.setContentText("New Restaurant Information has been added");
        Message.show();
    }
    
    @FXML
    void btnUpdate(ActionEvent event) {
    tvRestaurant.setItems(list);
        Alert Message = new Alert(Alert.AlertType.INFORMATION);
        Message.setContentText("Restaurant list has been updated");
        Message.show();
    }
    
    @FXML
    void btnDelete(ActionEvent event) {

        tvRestaurant.getItems().removeAll(tvRestaurant.getSelectionModel().getSelectedItem());
                
    }
    
    
    
    
    

    
   @Override
    public void initialize(URL location, ResourceBundle resources) {
        colID.setCellValueFactory(new PropertyValueFactory<Tableview,String>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<Tableview,String>("name"));
        colLocation.setCellValueFactory(new PropertyValueFactory<Tableview,String>("location"));
        colShares.setCellValueFactory(new PropertyValueFactory<Tableview,String>("shares"));
        colUnits.setCellValueFactory(new PropertyValueFactory<Tableview, String>("units"));

     
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }
    
}
