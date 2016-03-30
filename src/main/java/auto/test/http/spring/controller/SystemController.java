package auto.test.http.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import auto.test.http.spring.model.Project;
import auto.test.http.spring.model.TestCase;
import auto.test.http.spring.service.ProjectService;
import auto.test.http.utils.Auth;
import auto.test.http.utils.MessageMapping;

@Controller
public class SystemController {

	int messageCode=0;
	@Autowired
	ProjectService projSer;
	
	@RequestMapping("/test_manager")
	public String testManager(ModelMap model,TestCase tc){
		List<Project> list=projSer.listProject();
		model.addAttribute("listProject", list);
		return "test_manager";
	}
	
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
