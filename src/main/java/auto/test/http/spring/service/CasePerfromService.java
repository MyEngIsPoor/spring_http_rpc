package auto.test.http.spring.service;

import java.util.List;

import auto.test.http.spring.model.Result;

public interface CasePerfromService {


	public List<Result> listResult();
	
	public List<Result> getResultById(int... id);
	
	public boolean deleteResultById(int... id);
	
	public boolean updateResult(Result tc);	
}
