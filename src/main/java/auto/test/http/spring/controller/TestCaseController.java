package auto.test.http.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import auto.test.http.spring.model.TestCase;

@Controller
public class TestCaseController {

	@RequestMapping("/cases/add")
	@ResponseBody
	public String testCaseAdd(ModelMap model,TestCase tc){
		System.out.println(model);
		System.out.println(tc);
		return "ok!";
	}
	
	public String testCaseDelete(){
		return null;
		
	}
	
	public String testCaseUpdate(){
		return null;
		
	}
	
	public String testCaseSelect(){
		return null;
		
	}
}
