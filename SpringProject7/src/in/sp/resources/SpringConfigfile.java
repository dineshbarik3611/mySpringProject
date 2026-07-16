package in.sp.resources;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class SpringConfigfile {
	@Bean
   public Student stdId1() {
	   Student std = new Student();
	   
	   std.setName("Dinesh");
	   std.setRollno(100);
	   std.setEmail("dinesh@3611gmail.com");
	   
	   return std;
   }
}

