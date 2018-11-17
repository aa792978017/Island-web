package com.wx.islandweb.service.Impl;


import com.wx.islandweb.dao.ExploreDao;
import com.wx.islandweb.entity.Explore;
import com.wx.islandweb.result.Result;
import com.wx.islandweb.service.ExploreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
}
