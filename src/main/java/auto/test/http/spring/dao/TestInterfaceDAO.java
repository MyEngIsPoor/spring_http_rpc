package auto.test.http.spring.dao;

import java.util.List;

import auto.test.http.spring.model.TestInterface;

public interface TestInterfaceDAO {
	
	int deleteByPrimaryKey(Integer id);

	int insert(TestInterface record);

	int insertSelective(TestInterface record);

	TestInterface selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TestInterface record);

	int updateByPrimaryKey(TestInterface record);
	
	List<TestInterface> listTestInterfaces();
	
	List<TestInterface> listTestInterfacesByProjectId(Integer projectId);
}