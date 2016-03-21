package auto.test.http.spring.dao;

import org.apache.ibatis.annotations.Param;

import auto.test.http.spring.model.User;

public interface UserDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User loginCheck(@Param("username")String username, @Param("password")String password);
}