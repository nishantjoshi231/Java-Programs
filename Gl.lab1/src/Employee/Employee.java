package Employee;

public class Employee {
	public	String firstName;
	public	String lastName;
	
	public Employee(){}
	
	public	Employee(String firstName,String lastName){
			this.firstName=firstName;
			this.lastName=lastName;
		}
	public void setfirstName(String fname) {
		firstName=fname;
	}
	public void setLastName(String lname) {
		lastName=lname;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}

}
