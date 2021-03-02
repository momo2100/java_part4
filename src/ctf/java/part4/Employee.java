package ctf.java.part4;

public class Employee {
	public String firstname;
	public String lastname;
	private int salary;
	public String position; 
	
	public Employee(String firstnameInput, String lastnameInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = 15000; 
		this.position ="";
	}
	public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position ="";
	}
	public Employee(String firstnameInput, String lastnameInput, int salaryInput ,String positionInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.salary = salaryInput;
		this.position =positionInput;
	}
	
	public void hello() {
	System.out.println("Hello " + this.firstname );
	}
	public int getSalary() {
	return salary;
	}
	
	public void getPosition() {
		System.out.println("My position is " + position);
		}
}
