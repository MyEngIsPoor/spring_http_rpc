package auto.test.http.spring.dao;

import auto.test.http.spring.model.TestInterface;

public interface TestInterfaceDAO {
	
	int deleteByPrimaryKey(Integer id);

	int insert(TestInterface record);

	int insertSelective(TestInterface record);

	TestInterface selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(TestInterface record);

	int updateByPrimaryKey(TestInterface record);
}