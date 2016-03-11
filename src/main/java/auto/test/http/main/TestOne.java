package auto.test.http.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import auto.test.http.spring.model.Test;
import auto.test.http.spring.service.TestService;

public class TestOne {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("classpath:conf/spring.xml");
		TestService testService = (TestService)ac.getBean("testService");
		Test t=testService.getOneById(1);
		System.out.println(t.getName());
	}
}
