package com.wx.islandweb.dao;

import com.wx.islandweb.entity.Comment;
import com.wx.islandweb.entity.Explore;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface ExploreDao {
    /**
     * 获取所有探索信息
     * @return
     */
    ArrayList<Explore> getAllExploreInfo();

    /**
     * 用户编写探索
     * @param writeExploreData
     * @return
     */
    Integer addExplore(@Param("writeExploreData") Explore writeExploreData);
    Integer addExploreShare(@Param("writeExploreData") Explore writeExploreData);

    /**
     * 获取探索的评论信息
     * @return
     */
    ArrayList<Comment> getCommentInfo(@Param("exploreId") int exploreId);
}
