package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Employee;

public class Main {
	public static void main(String[] args) {
		String config_loc = "applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(config_loc );
				
				
				Employee emp = (Employee) context.getBean("empId");
		emp.display();
	}

}
