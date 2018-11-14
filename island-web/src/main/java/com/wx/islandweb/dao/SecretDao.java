package com.wx.islandweb.dao;

import com.wx.islandweb.entity.Secret;

import java.util.ArrayList;


public interface SecretDao {
    /**
     * 获取所有动态信息
     * @return
     */
    ArrayList<Secret> getAllSecret();
}
