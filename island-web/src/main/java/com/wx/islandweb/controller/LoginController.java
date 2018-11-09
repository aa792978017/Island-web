package com.wx.islandweb.controller;

import com.wx.islandweb.entity.User;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户登录
     * @param loginData
     * @return
     */
    @PostMapping("/login")
    public Result Login(@RequestBody User loginData){
        Result result = new Result();
        User userData = new User();
        userData.setNeckName(loginData.getNeckName());
        userData.setPassword(loginData.getPassword());
        result = loginService.login(loginData);
        return result;

    }
}
