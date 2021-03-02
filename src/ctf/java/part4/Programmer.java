package ctf.java.part4;

public class Programmer  extends Employee implements IWebsiteCreator{
	public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
		super(firstnameInput, lastnameInput, salaryInput);
	}
	public Programmer(String firstnameInput, String lastnameInput) {
		super(firstnameInput, lastnameInput);
	}
	public void createWebsit(String template , String titleName) {
		
	}
	
	public void installWindows(String version , String ProductKey) {
		
	}
	@Override
	public void createWebsite(String template, String titleName) {
		// TODO Auto-generated method stub
		
	}
}
