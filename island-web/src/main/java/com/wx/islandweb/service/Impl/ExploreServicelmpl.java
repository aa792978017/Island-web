package com.wx.islandweb.service.Impl;


import com.wx.islandweb.dao.ExploreDao;
import com.wx.islandweb.entity.Comment;
import com.wx.islandweb.entity.Explore;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.ExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

@Service
public class ExploreServicelmpl implements ExploreService {

    @Autowired
    private ExploreDao exploreDao;

    /**
     * 获取所有的探索信息
     * @return
     */

    @Override
    public Result getAllExploreInfo() {
        Result resultMap;
        ArrayList<Explore> explores = new ArrayList<>();
        explores = exploreDao.getAllExploreInfo();
        if (explores.size() > 0) {
            resultMap = new Result();
            resultMap.setCode(200);
            resultMap.setSuccess(true);
            resultMap.setData(explores);
        }else{
            resultMap = new Result(500, false, null);
        }
        return resultMap;
    }

    /**
     *用户编写探索
     * @param writeExploreData
     * @return
     */
    @Override
    public Result writeExplore(Explore writeExploreData) {
        Date nowTime = new Date();
        writeExploreData.setIssueTime(nowTime);
        Integer insertExploreInfo = exploreDao.addExplore(writeExploreData);
        Integer insertExploreShare = exploreDao.addExploreShare(writeExploreData);
        Result result = new Result();
        if (insertExploreInfo == 1 && insertExploreShare == 1) {
            result.setCode(200);
            result.setSuccess(true);
        }else{
            result.setCode(500);
            result.setSuccess(false);
        }
        return result;
    }

    /**
     * 获取探索的评论信息
     * @return
     */
    @Override
    public Result getCommentInfo(int exploreId) {
        Result resultMap;
        ArrayList<Comment> comments = new ArrayList<>();
        System.out.println(exploreId);
        comments = exploreDao.getCommentInfo(exploreId);
        if (comments.size() > 0) {
            resultMap = new Result();
            resultMap.setCode(200);
            resultMap.setSuccess(true);
            resultMap.setData(comments);
        }else{
            resultMap = new Result(500, false, null);
        }
        return resultMap;
    }
}
