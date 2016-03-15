package auto.test.http.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping({"/","/index"})
	public String indexPage(){
		if(true){
			return "index";
		}
		return "redirect:/login";
	}
	
	@RequestMapping({"/login"})
	public String loginPage(){
		return "login";
	}
	
	@RequestMapping({"/loginCheck"})
	public String loginCheck(String username,String password){
		//if success to indexPage or return message
		if(true){
			return "re";
		}
		return "login_failed";
	}
	
	
}
