package employee;

public class Employee {

	private int eid;
	private String name;
	private String department;
	private float salary;
	private String mobileNo;
	
	
	public Employee() {
		super();
	}

	public Employee(int eid, String name, String department, float salary,
			String mobileNo) {
		super();
		this.eid = eid;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.mobileNo = mobileNo;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

}