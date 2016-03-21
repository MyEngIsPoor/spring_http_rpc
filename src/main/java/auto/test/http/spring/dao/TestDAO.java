package auto.test.http.spring.dao;

import auto.test.http.spring.model.Test;

public interface TestDAO {
	
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);
    Test selectByPrimaryKey2(Integer uid);
    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}