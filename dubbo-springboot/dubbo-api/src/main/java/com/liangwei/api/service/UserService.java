package com.liangwei.api.service;

import com.liangwei.api.model.User;

import java.util.List;

public interface UserService {

    void AddUser(User user);

    void delUserById(int no);

    void updateUserByNo(User user);

    List<User> getUser();
}
