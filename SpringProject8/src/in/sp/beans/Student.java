package in.sp.beans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("Dinesh")
    private String name;
	@Value("100")
    private int rollno;
	@Value("87.99f")
    private float marks;
    
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public int getRollno() {
    	return rollno;
    	
    }
    public void setRollno(int rollno) {
    	this.rollno = rollno;
    }
    public float getMarks() {
    	return marks;
    }
    public void setMarks(int marks) {
    	this.marks = marks;
    }
    public  void display() {
    	System.out.println("Name : "+name);
    	System.out.println("Rollno : "+rollno);
    	System.out.println("marks : "+marks);
    }
}
