package com.wx.islandweb.service.Impl;

import com.wx.islandweb.dao.SecretDao;
import com.wx.islandweb.entity.Secret;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Service
public class SecretServiceImpl implements SecretService{

    @Autowired
    private SecretDao secretDao;

    /**
     * 获取所有的秘密信息
     * @return
     */
    @Override
    public Result getAllSecret() {
        Result resultMap;
        ArrayList<Secret> secrets = new ArrayList<>();
        secrets = secretDao.getAllSecret();
        if (secrets.size() > 0) {
            resultMap = new Result();
            resultMap.setCode(200);
            resultMap.setSuccess(true);
            resultMap.setData(secrets);
        }else{
            resultMap = new Result(500, false, null);
        }
        return resultMap;
    }
}
