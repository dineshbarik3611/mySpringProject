package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	@Bean
	public Address createAddrObj() {
		Address addr = new Address();
		addr.setHouseno(100);
		addr.setCity("odisah");
		addr.setPincode(754216);
		
		return addr;
	}
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setRollno(101);
		std.setName("Dinesh");
		std.setAddress(createAddrObj());
		return std;
	}

}
