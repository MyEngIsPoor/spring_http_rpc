package auto.test.http.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import auto.test.http.spring.dao.TestDAO;
import auto.test.http.spring.model.Test;
import auto.test.http.spring.service.TestService;

@Service(value="testService")
public class TestServiceImpl implements TestService {
	@Resource
	private TestDAO testDAO;
	@Override
	public Test getOneById(int uid) {
		// TODO Auto-generated method stub
		return testDAO.selectByPrimaryKey2(uid);
	}

	
}
