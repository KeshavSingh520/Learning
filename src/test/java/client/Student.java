package client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class Student extends AbstractTestNGSpringContextTests{
	
	@Value("${Student.name}")
	private String name;
	@Value("${Student.rollNo}")
	private String rollNo;

	
	public String getName() {
		return name;
	}
	
	public String getRollNo() {
		return rollNo;
	}


	
	
	@Test
	public void displayStudentInfo() {
		System.out.println("Name: "+name);
		System.out.println("Rollno: "+rollNo);
	}

}
