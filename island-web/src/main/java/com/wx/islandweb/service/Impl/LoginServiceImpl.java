package com.wx.islandweb.service.Impl;

import com.wx.islandweb.dao.LoginDao;
import com.wx.islandweb.entity.User;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginDao loginDao;

    /**
     *
     * @param loginData
     * @return
     */
    @Override
    public Result login(User loginData) {
        User trueUser = loginDao.login(loginData);
        Result result = new Result();
        if (trueUser == null) {
            result.setCode(101);
            result.setSuccess(false);
        } else {
            result.setCode(233);
            result.setSuccess(true);
        }
        return result;
    }
}
