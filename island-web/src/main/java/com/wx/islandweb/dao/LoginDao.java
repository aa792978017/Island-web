package com.wx.islandweb.dao;


import com.wx.islandweb.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


public interface LoginDao {
//    @Select("SELECT * FROM user")
    User login(@Param("loginData") User loginData);
}
