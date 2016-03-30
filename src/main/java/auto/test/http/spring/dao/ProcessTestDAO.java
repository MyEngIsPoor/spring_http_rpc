package auto.test.http.spring.dao;

import auto.test.http.spring.model.ProcessTest;

public interface ProcessTestDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ProcessTest record);

    int insertSelective(ProcessTest record);

    ProcessTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ProcessTest record);

    int updateByPrimaryKey(ProcessTest record);
}