package auto.test.http.spring.service;

import java.util.List;

import auto.test.http.spring.model.User;

public interface UserService {

	public List<User> listUser();
	
	public List<User> getUserById(int... id);
	
	public boolean deleteUserById(int... id);
	
	public boolean updateUser(User tc);
}
