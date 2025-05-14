package com.digi;

import com.digi.beans.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("applicationcontext.xml") //Link xml file to springboot application//In intellij spring bean configuration file should be in resource folder
public class BootDiProj2Application {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootDiProj2Application.class, args);
		//get Target Spring bean class object
		Student  st=ctx.getBean("stud",Student.class);
		//invoke b.method
		st.preparation("CTS-Interview");
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}//main

}
