package auto.test.http.spring.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import auto.test.http.spring.dao.TestCaseDAO;
import auto.test.http.spring.model.TestCase;
import auto.test.http.spring.service.CaseManagerService;

@Service("CaseManagerService")
public class CaseManagerSerivceImpl implements CaseManagerService {

	@Resource
	private TestCaseDAO testcaseDAO;
	@Override
	public List<TestCase> listTestCase() {
		// TODO Auto-generated method stub
		return testcaseDAO.listTestCase();
	}

	@Override
	public List<TestCase> getTestCaseById(int... id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTestCaseById(int... id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTestCase(TestCase tc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TestCase> listTestCase(int interface_id) {
		// TODO Auto-generated method stub
		return testcaseDAO.listTestCaseByInterface(interface_id);
	}

}
