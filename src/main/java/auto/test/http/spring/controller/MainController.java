package auto.test.http.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import auto.test.http.spring.model.User;
import auto.test.http.spring.service.SystemService;

@Controller
@SessionAttributes("currUser")
public class MainController {
	
	@Autowired
	SystemService sysSer;

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
	
	public String loginCheck(String username,String password ,ModelMap model){
		//if success to indexPage or return message
		System.out.println(username);
		System.out.println(password);
		User currUser=sysSer.loginCheck(username, password);
		if(currUser!=null){
			model.addAttribute(currUser);
			return "index";
		}
		return "test";
	}
	
	
}
