package auto.test.http.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import auto.test.http.spring.model.Test;
import auto.test.http.spring.service.TestService;

public class TestOne {
	@Autowired
	TestService testService;
	public static void main(String[] args) {
		
		TestOne to=new TestOne();
		Test t=to.testService.getOneById(1);
		System.out.println(t.getName());
	}
}
