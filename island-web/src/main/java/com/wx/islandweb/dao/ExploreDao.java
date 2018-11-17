package com.wx.islandweb.dao;

import com.wx.islandweb.entity.Explore;

import java.util.ArrayList;

public interface ExploreDao {
    /**
     * 获取所有探索信息
     * @return
     */
    ArrayList<Explore> getAllExploreInfo();
}
