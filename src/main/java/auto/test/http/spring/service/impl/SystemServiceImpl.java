package auto.test.http.spring.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import auto.test.http.spring.dao.UserDAO;
import auto.test.http.spring.model.User;
import auto.test.http.spring.service.SystemService;

@Service("SystemService")
public class SystemServiceImpl implements SystemService{
	@Resource
	private UserDAO userDAO;
	@Override
	public User loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		return userDAO.loginCheck(username,password);
	}

	@Override
	public boolean userAdd() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userDelete() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean userUpdate() {
		// TODO Auto-generated method stub
		return false;
	}

}
