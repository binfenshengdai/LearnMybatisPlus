package com.huo.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huo.mybatisplus.entity.User;
import com.huo.mybatisplus.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
    IUserService userService;

    @Test
    void delete() {
        userService.remove(new QueryWrapper<User>().gt("id", 3));
    }

    @Test
    void listAll() {
        Page page = new Page();
//        IPage iPage = userService.selectUserPage(page);
//        List records = iPage.getRecords();
        List<User> list = userService.list();
        Page page1 = userService.page(page);

    }
}
