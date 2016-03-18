package auto.test.http.spring.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import auto.test.http.spring.model.Result;
import auto.test.http.spring.service.CasePerfromService;

@Service("CasePerfromService")
public class CasePerfromServiceImpl implements CasePerfromService{

	@Override
	public List<Result> listResult() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Result> getResultById(int... id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteResultById(int... id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateResult(Result tc) {
		// TODO Auto-generated method stub
		return false;
	}

}
