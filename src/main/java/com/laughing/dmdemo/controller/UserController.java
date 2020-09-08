package com.laughing.dmdemo.controller;

import com.laughing.dmdemo.dao.User;
import com.laughing.dmdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description:
 * @date 20202020/9/8 15:09
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 单条用户插入
     *
     * @param name
     * @param age
     * @return
     */
    @GetMapping("insert/{name}/{age}")
    public int insertUser(@PathVariable("name") String name,
                          @PathVariable("age") String age) {

        return userService.insertUser(UUID.randomUUID().toString(), name, Integer.valueOf(age));
    }

    @GetMapping("/getall")
    public List<User> getAll() {
        return userService.getAll();
    }
}
