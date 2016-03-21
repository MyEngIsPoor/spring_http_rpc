package auto.test.http.spring.service;

import java.util.List;

import auto.test.http.spring.model.TestCase;

public interface CaseManagerService {

	public List<TestCase> listTestCase();
	
	public List<TestCase> getTestCaseById(int... id);
	
	public boolean deleteTestCaseById(int... id);
	
	public boolean updateTestCase(TestCase tc);
}
