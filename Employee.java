//Create a separate package
package com.guruits.Hibernate;

//Import Methods
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity			//Annotation create for Entity;
@Table			//Annotation create for Table;
	//Create class name Employee
public class Employee  {
@Id				//Annotation create for Id;
	private int Employee_Id;
	private String Employee_Name;
	private String Employee_Address;
	private int Employee_Mobile;
	private int Employee_Salary;
	private int Employee_JoinedOn;
	
	//Apply Getter and Setter Method
	public int getEmployee_Id() {
		return Employee_Id;
	}
	public void setEmployee_Id(int employee_Id) {
		Employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getEmployee_Address() {
		return Employee_Address;
	}
	public void setEmployee_Address(String employee_Address) {
		Employee_Address = employee_Address;
	}
	public int getEmployee_Mobile() {
		return Employee_Mobile;
	}
	public void setEmployee_Mobile(int employee_Mobile) {
		Employee_Mobile = employee_Mobile;
	}
	public int getEmployee_Salary() {
		return Employee_Salary;
	}
	public void setEmployee_Salary(int employee_Salary) {
		Employee_Salary = employee_Salary;
	}
	public int getEmployee_JoinedOn() {
		return Employee_JoinedOn;
	}
	public void setEmployee_JoinedOn(int employee_JoinedOn) {
		Employee_JoinedOn = employee_JoinedOn;
	}
	
	//Apply toString Method
	@Override
	public String toString() {
		return "Employee [Employee_Id=" + Employee_Id + ", Employee_Name=" + Employee_Name + ", Employee_Address="
				+ Employee_Address + ", Employee_Mobile=" + Employee_Mobile + ", Employee_Salary=" + Employee_Salary
				+ ", Employee_JoinedOn=" + Employee_JoinedOn + "]";
	}

	
}
