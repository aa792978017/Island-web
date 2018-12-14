package com.wx.islandweb.service;

import com.wx.islandweb.entity.Explore;
import com.wx.islandweb.result.Result;

public interface ExploreService {
    /**
     * 获取数据库里面所有的秘密信息
     * @return
     */
    Result getAllExploreInfo();

    Result writeExplore(Explore writeExploreData);

    Result getCommentInfo(int exploreId);
}
