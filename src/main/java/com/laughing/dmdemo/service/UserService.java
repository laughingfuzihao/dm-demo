package com.laughing.dmdemo.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.laughing.dmdemo.dao.User;
import com.laughing.dmdemo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/8 15:07
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 单条插入
     * @return
     */
    public int insertUser(String id, String name, int age) {
        return userMapper.addUser(id, name, age);
    }

    /**
     * 查询全部
     */
    public List<User> getAll() {


        return userMapper.selectAll();
    }
}
