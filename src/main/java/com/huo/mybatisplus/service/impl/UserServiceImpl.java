package com.huo.mybatisplus.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.huo.mybatisplus.entity.User;
import com.huo.mybatisplus.mapper.UserMapper;
import com.huo.mybatisplus.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public IPage<User> selectUserPage(Page<User> page) {
        return baseMapper.selectPageVo(page);
    }
}
