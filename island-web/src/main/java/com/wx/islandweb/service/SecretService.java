package com.wx.islandweb.service;

import com.wx.islandweb.result.Result;

public interface SecretService {

    /**
     * 获取数据库里面所有的秘密信息
     * @return
     */
    Result getAllSecret();
}
