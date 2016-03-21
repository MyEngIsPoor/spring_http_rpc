package auto.test.http.spring.service;

import org.springframework.stereotype.Service;

import auto.test.http.spring.model.User;

@Service("SystemService")
public interface SystemService {

	public User loginCheck(String username,String password);
	public boolean userAdd();
	public boolean userDelete();
	public boolean userUpdate();
//	public String userSelect();
}
