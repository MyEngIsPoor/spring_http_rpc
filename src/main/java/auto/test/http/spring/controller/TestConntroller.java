package auto.test.http.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import auto.test.http.spring.model.TestCase;
import auto.test.http.spring.service.TestService;
import auto.test.http.utils.Auth;
import auto.test.http.utils.Auth.Permission;

@Controller
@Auth(Permission.ADMIN)
public class TestConntroller {
	@Autowired
	@Qualifier("testService")
	TestService testttt;
	
	@RequestMapping("/test")
	@ResponseBody
	public String Test(){
		auto.test.http.spring.model.Test tt=testttt.getOneById(1);
		System.out.println(tt.getName());
		System.out.println(tt.getValue());
		return "test";
	}
	
	@RequestMapping("/re")
	public String re(){
		RuntimeException re;
		return "redirect:/test";
	}
	
}
