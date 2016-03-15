package auto.test.http.spring.dao;

import auto.test.http.spring.model.Result;

public interface ResultDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Result record);

    int insertSelective(Result record);

    Result selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}