package com.wx.islandweb.controller;

import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.ExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：探索信息处理
 * 开发人员：Szabo
 * 日期：2018-11-17
 */
@RestController
@CrossOrigin
@RequestMapping("/explore")
public class ExploreController {

    @Autowired
    private ExploreService exploreService;
    /**
     * 返回探索信息给前端
     * @return
     */
    @PostMapping("/getAllExploreInfo")
    public Result getAllExploreInfo() {
        Result resultMap = exploreService.getAllExploreInfo();
        return resultMap;
    }
}
