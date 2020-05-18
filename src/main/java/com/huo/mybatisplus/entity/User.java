package com.huo.mybatisplus.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

    @TableLogic
    private String valid;

    private Date createTime;
}
