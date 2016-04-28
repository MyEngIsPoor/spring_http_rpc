package auto.test.http.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import auto.test.http.spring.model.Project;
import auto.test.http.spring.model.TestInterface;
import auto.test.http.spring.service.ProjectService;

@Controller
public class ProjectManagerController {

	@Autowired
	ProjectService projs;
	
	@RequestMapping("/project/list")
	public List<Project> listProject(){
		return projs.listProject();
	}
	
	@RequestMapping("/interface/list")
	@ResponseBody
	public List<TestInterface> listInterface(int id){
		return projs.listTestInterface();
	}
	
	public String projecyAdd(){
		return null;
		
	}
	
	public String projecyDelete(){
		return null;
		
	}
	
	public String projecyUpdate(){
		return null;
		
	}
	
	public String projecySelect(){
		return null;
		
	}
}
