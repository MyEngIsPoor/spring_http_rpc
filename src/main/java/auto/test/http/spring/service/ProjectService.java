package auto.test.http.spring.service;

import java.util.List;

import auto.test.http.spring.model.Project;
import auto.test.http.spring.model.TestInterface;

public interface ProjectService {

	public List<Project> listProject();
	
	public List<Project> getProjectById(int... id);
	
	public boolean deleteProjectById(int... id);
	
	public boolean updateProject(Project p);
	
	public List<TestInterface> listTestInterface();
	
	public List<TestInterface> getTestInterface(int... id);
	
	public boolean deleteTestInterfaceById(int... id);
	
	public boolean updateTestInterface(TestInterface ti);
	
	
}
