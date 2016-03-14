package auto.test.http.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestConntroller {
	
	@RequestMapping("/test")
	public String Test(){
		
		return "test";
	}
	
	@RequestMapping("/re")
	public String re(){
		return "redirect:/test";
	}
	
}
