package com.wx.islandweb.controller;

import com.wx.islandweb.entity.Explore;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.ExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    /**
     * 用户编写探索
     * @param writeExploreData
     * @return
     */
    @PostMapping("/writeExplore")
    public Result writeExplore(@RequestBody Explore writeExploreData) {
        Result result = new Result();
        result = exploreService.writeExplore(writeExploreData);
        return result;
    }
    /**
     * 返回探索的评论给前端
     * @return
     */
    @PostMapping("/getCommentInfo")
    public Result getCommentInfo(@RequestBody int exploreId) {
        Result resultMap = exploreService.getCommentInfo(exploreId);
        return resultMap;
    }
}
