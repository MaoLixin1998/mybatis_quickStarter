package com.lagou.dao;

import com.lagou.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName IUserDao
 * @Description TODO
 * @Author mao
 * @Data 2021/6/21 15:32
 **/
public interface IUserDao {

    public List<User> findAll() throws IOException;
    public List<User> findByCondition(User user) throws IOException;
}
