package com.laughing.dmdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.laughing.dmdemo.dao.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.sql.Wrapper;
import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/8 15:05
 */
@Component
public interface UserMapper extends BaseMapper<User> {

    @Select("SELECT * FROM \"LAUGHING\".\"user\";")
    List<User> selectAll();

    @Insert(" INSERT INTO \"LAUGHING\".\"user\" " +
            "(id,name,age)" +
            "VALUES (#{id},#{name},#{age})")
    int addUser(String id, String name, int age);
}
