package com.wx.islandweb.dao;

import com.wx.islandweb.entity.Registry;
import org.apache.ibatis.annotations.Param;

/**
 * 用于操作数据库的Registry表
 */
public interface RegistryDao {
    /**
     * 实现登录功能
     * 通过userName获取registry表里面的用户信息
     * @param loginData
     * @return
     */
    Registry getRegistryInfoByUserName(@Param("loginData") Registry loginData);
}
