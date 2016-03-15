package auto.test.http.spring.dao;

import auto.test.http.spring.model.TestCase;

public interface TestCaseDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(TestCase record);

    int insertSelective(TestCase record);

    TestCase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TestCase record);

    int updateByPrimaryKey(TestCase record);
}