package auto.test.http.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import auto.test.http.spring.model.TestCase;
import auto.test.http.spring.model.TestInterface;
import auto.test.http.spring.service.CaseManagerService;

@Controller
public class TestCaseController {

	@Autowired
	CaseManagerService caseManagerSr;
	
	@RequestMapping("/cases/add")
	@ResponseBody
	public String testCaseAdd(ModelMap model,TestCase tc){
		System.out.println(model);
		System.out.println(tc);
		return "ok!";
	}
	
	@RequestMapping("/cases/list")
	@ResponseBody
	public List<TestCase> listTestCase(int interface_id){
		return caseManagerSr.listTestCase(interface_id);
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
