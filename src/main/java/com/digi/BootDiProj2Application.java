package com.digi;

import com.digi.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootDiProj2Application {

	public static void main(String[] args) {
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(BootDiProj2Application.class, args);
		//get target spring bean class object
		Student st=ctx.getBean("stud", Student.class);
		//invoke business method
		st.participate("Blinkit Organization");
		//close container
		((org.springframework.context.ConfigurableApplicationContext) ctx).close();
	}

}
