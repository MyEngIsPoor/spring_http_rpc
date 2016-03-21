package auto.test.http.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import auto.test.http.utils.MessageMapping;

@Controller
public class SystemController {

	int messageCode=0;
	
	public void setMessageCode(int messageCode) {
		this.messageCode = messageCode;
	}
	
	@RequestMapping("/message")
	@ResponseBody
	public String getMessage(){
		return MessageMapping.getMsgByCode(messageCode);
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
