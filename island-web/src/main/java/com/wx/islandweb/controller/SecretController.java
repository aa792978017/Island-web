package com.wx.islandweb.controller;

import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.SecretService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：秘密信息处理
 * 开发人员：wangchang
 * 日期：2018-11-09
 */
@RestController
@CrossOrigin
@RequestMapping("/square")
public class SecretController {

    @Autowired
    private SecretService secretService;
    /**
     * 返回秘密信息给前端
     * @return
     */
    @PostMapping("/getAllSecret")
    public Result getAllSecret() {
        Result resultMap = secretService.getAllSecret();
        return resultMap;
    }

}
