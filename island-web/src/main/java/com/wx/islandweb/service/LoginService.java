package com.wx.islandweb.service;

import com.wx.islandweb.entity.Registry;
import com.wx.islandweb.entity.User;
import com.wx.islandweb.result.Result;

public interface LoginService {

    Result login(Registry loginData);
}
