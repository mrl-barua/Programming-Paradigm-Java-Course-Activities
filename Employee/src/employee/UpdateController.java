package employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class UpdateController {
	@FXML
	private TextField ename;
	@FXML
	private TextField dept;
	@FXML
	private TextField mobNo;
	@FXML
	private TextField salary;
	@FXML 
	private TextField id;
	
	@FXML
	private Label lavel;
	
	@FXML
	private TableView<Employee> table;
	
	@FXML
	private TableColumn<Employee, Integer> eid;
	@FXML
	private TableColumn<Employee, String> name;
	@FXML
	private TableColumn<Employee, String> department;
	@FXML
	private TableColumn<Employee, Float> salary1;
	@FXML
	private TableColumn<Employee, String> mobile;
	
	
	Employee emp;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement pstmt=null;
	
	public void updateEmployee(ActionEvent ae){
		emp=new Employee();
		emp.setEid(Integer.parseInt(id.getText()));
		emp.setName(ename.getText());
		emp.setDepartment(dept.getText());
		emp.setMobileNo(mobNo.getText());
		emp.setSalary(Float.parseFloat(salary.getText()));
		
		if(emp.getMobileNo().length()<10 || emp.getMobileNo().length()>10){
			lavel.setText("please enter correct mobile No");
			return;
		}
		
		try {
			con=DBUtil.getConnection();
			String sql="update employee set name=?,department=?,mobileno=?,salary=? where id=?";
			pstmt=con.prepareStatement(sql);
			pstmt.setString(1,emp.getName());
			pstmt.setString(2,emp.getDepartment());
			pstmt.setString(3,emp.getMobileNo());
			pstmt.setFloat(4, emp.getSalary());
			pstmt.setInt(5, emp.getEid());
			rs=pstmt.executeQuery();
			if(rs.next()){
				lavel.setText("Update Sucessfully.");
				eid.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("eid"));
				name.setCellValueFactory(new PropertyValueFactory<Employee, String>("name"));
				department.setCellValueFactory(new PropertyValueFactory<Employee, String>("department"));
				salary1.setCellValueFactory(new PropertyValueFactory<Employee, Float>("salary1"));
				mobile.setCellValueFactory(new PropertyValueFactory<Employee, String>("mobile"));
				ObservableList<Employee> data = FXCollections.observableArrayList(
				         new Employee(emp.getEid(),emp.getName(),emp.getDepartment(),emp.getSalary(),emp.getMobileNo())
				);
					
					table.getItems().addAll(data);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}