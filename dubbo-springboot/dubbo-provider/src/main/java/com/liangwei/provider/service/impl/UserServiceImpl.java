package com.liangwei.provider.service.impl;

import com.liangwei.api.model.User;
import com.liangwei.api.service.UserService;
import com.liangwei.provider.mapper.UserMapper;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void AddUser(User user) {
        userMapper.AddUser(user);
    }

    @Override
    public void delUserById(int no) {
        userMapper.delUserById(no);
    }

    @Override
    public void updateUserByNo(User user) {
        userMapper.updateUserByNo(user.getName(),user.getEmail(),user.getNo());
    }

    @Override
    public List<User> getUser() {
        List<User> aa= userMapper.getUser();
        return aa;
    }
}
