package in.sp.beans;

public class Employee {
	private String name;
	private int empid;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		System.out.println("Name: "+name );	
		System.out.println("Empid: "+empid );	
		System.out.println("Email: "+email );	

}
