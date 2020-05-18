package com.huo.mybatisplus.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestUtil {

    @Value("${myname.first}")
    private String name;

    public String getName(){
        return name;
    }
}
