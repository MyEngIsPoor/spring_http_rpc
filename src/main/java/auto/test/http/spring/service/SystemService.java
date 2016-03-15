package auto.test.http.spring.service;

import org.springframework.stereotype.Service;

@Service("SystemService")
public interface SystemService {

	public boolean loginCheck(String username,String password);
	public boolean userAdd();
	public boolean userDelete();
	public boolean userUpdate();
//	public String userSelect();
}
