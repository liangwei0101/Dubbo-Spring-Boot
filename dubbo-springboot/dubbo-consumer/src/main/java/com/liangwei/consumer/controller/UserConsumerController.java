package com.liangwei.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.liangwei.api.model.User;
import com.liangwei.api.service.DemoService;
import com.liangwei.api.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserConsumerController {

    @Reference
    private UserService userService;

    @RequestMapping(value ="/user", method = RequestMethod.GET)
    public List<User> UserQry() {
        List<User> aa = userService.getUser();
        return aa;
    }

    @RequestMapping(value ="/user", method = RequestMethod.POST)
    public void UserAdd(User user){
        userService.AddUser(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.PUT)
    public void UserUpdate(User user){
        userService.updateUserByNo(user);
    }

    @RequestMapping(value ="/user", method = RequestMethod.DELETE)
    public void UserDel(@RequestParam(value="no") int no){
        userService.delUserById(no);
    }
}
