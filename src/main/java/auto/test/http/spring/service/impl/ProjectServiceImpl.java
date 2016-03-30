package auto.test.http.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import auto.test.http.spring.dao.ProjectDAO;
import auto.test.http.spring.dao.TestInterfaceDAO;
import auto.test.http.spring.model.Project;
import auto.test.http.spring.model.TestInterface;
import auto.test.http.spring.service.ProjectService;

@Service("ProjectService")
public class ProjectServiceImpl implements ProjectService {
	
	@Resource
	private TestInterfaceDAO tiDAO;
	@Resource
	private ProjectDAO pjDAO;
	
	@Override
	public List<Project> listProject() {
		
		return pjDAO.listProjects();
	}

	@Override
	public List<Project> getProjectById(int... id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteProjectById(int... id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateProject(Project p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TestInterface> listTestInterface() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TestInterface> getTestInterface(int... id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTestInterfaceById(int... id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTestInterface(TestInterface ti) {
		// TODO Auto-generated method stub
		return false;
	}

}
	