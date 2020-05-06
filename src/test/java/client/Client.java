package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("application-context.xml");
		System.out.println("Bean file loaded.... ");
		Student learnbean=context.getBean("student",Student.class);
		learnbean.displayStudentInfo();
	}

}
