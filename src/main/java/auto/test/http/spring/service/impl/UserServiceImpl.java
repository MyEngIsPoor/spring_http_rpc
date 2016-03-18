package auto.test.http.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import auto.test.http.spring.model.User;
import auto.test.http.spring.service.UserService;

@Service("UserService")
public class UserServiceImpl implements UserService{

	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserById(int... id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int... id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User tc) {
		// TODO Auto-generated method stub
		return false;
	}

}
