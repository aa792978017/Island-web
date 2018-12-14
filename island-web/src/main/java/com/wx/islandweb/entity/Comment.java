package com.wx.islandweb.entity;

import java.util.Date;

/**
 * 评论的动态实体类
 *
 */
public class Comment {
    private int exploreId;

    private int userId;

    private Date issueTime;

    private String content;

    public int getExploreId() {
        return exploreId;
    }

    public void setExploreId(int exploreId) {
        this.exploreId = exploreId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
