package auto.test.http.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import auto.test.http.spring.dao.TestDAO;
import auto.test.http.spring.model.Test;
import auto.test.http.spring.service.TestService;

@Service("testService2")
public class TestServiceImpl2 implements TestService{
	@Resource
	private TestDAO testDAO;
	@Override
	public Test getOneById(int id) {
		// TODO Auto-generated method stub
		return testDAO.selectByPrimaryKey(id);
	}
}
