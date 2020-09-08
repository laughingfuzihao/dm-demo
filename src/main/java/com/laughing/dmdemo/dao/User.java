package com.laughing.dmdemo.dao;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Fu zihao
 * @version 1.0
 * @Description: 用户表
 * @date 20202020/9/8 14:59
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User {
    @TableId
    private String id;
    private String name;
    private int age;
}
