package com.huo.mybatisplus.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.huo.mybatisplus.entity.User;

public interface IUserService extends IService<User> {
    public IPage<User> selectUserPage(Page<User> page);
}
