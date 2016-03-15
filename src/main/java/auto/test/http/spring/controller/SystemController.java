package auto.test.http.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SystemController {

	@RequestMapping("/message")
	@ResponseBody
	public String getMessage(int messageCode){
		switch (messageCode){
		case 1:
			return "1";
		}
		return "message error!";
	}
	
	public String userAdd(){
		return null;
		
	}
	
	public String userDelete(){
		return null;
		
	}
	
	public String userUpdate(){
		return null;
		
	}
	
	public String userSelect(){
		return null;
		
	}
	
	//XITONG SHE ZHI 
	public String permissionUpdate(){
		return null;
		
	}
}
