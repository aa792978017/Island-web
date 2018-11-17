package com.wx.islandweb.service.Impl;

import com.wx.islandweb.dao.LoginDao;
import com.wx.islandweb.dao.RegistryDao;
import com.wx.islandweb.entity.Registry;
import com.wx.islandweb.entity.User;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 * 实现登录功能
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private RegistryDao registryDao;

    /**
     *查询校验用户名密码
     * @param loginData
     * @return
     */
    @Override
    public Result login(Registry loginData) {
        Registry trueUser = registryDao.getRegistryInfoByUserName(loginData);
        Result result = new Result();
        if (trueUser == null) {
            result.setCode(101);
            result.setSuccess(false);
        } else {
            result.setCode(233);
            result.setSuccess(true);
            result.setData(loginData.getUserId());
        }
        return result;
    }
}
