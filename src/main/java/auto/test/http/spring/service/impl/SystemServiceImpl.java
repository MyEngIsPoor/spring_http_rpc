package auto.test.http.spring.service.impl;

import org.springframework.stereotype.Service;
import auto.test.http.spring.service.SystemService;

@Service("SystemService")
public class SystemServiceImpl implements SystemService{

	@Override
	public boolean loginCheck(String username, String password) {
		// TODO Auto-generated method stub
		return false;
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
