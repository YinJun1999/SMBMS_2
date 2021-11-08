package com.wtu.mapper;

import com.wtu.entity.User;
import com.wtu.entity.UserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
   // 登录
    User login(Map<String, Object> map);
    //查询所有
    List<User> allUsers();
    //添加用户
    void addUsers();


    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);


}