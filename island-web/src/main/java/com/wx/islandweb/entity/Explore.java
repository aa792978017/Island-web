package com.wx.islandweb.entity;

import java.util.Date;

/**
 * 探索的动态实体类
 *
 */
public class Explore {
    private int exploreId;

    private String content;

    private String picture;

    private Date issueTime;

    private int likeNumber;

    private int shareNumber;

    private int browserNumber;

    private int reportNumber;

    private int commentState;

    private int type;

    public int getExploreId() {
        return exploreId;
    }

    public void setExploreId(int exploreId) {
        this.exploreId = exploreId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Date issueTime) {
        this.issueTime = issueTime;
    }

    public int getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(int likeNumber) {
        this.likeNumber = likeNumber;
    }

    public int getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(int shareNumber) {
        this.shareNumber = shareNumber;
    }

    public int getBrowserNumber() {
        return browserNumber;
    }

    public void setBrowserNumber(int browserNumber) {
        this.browserNumber = browserNumber;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public int getCommentState() { return commentState; }

    public void setCommentState(int commentState) { this.commentState = commentState; }

    public int getType() { return  type; }

    public void setType(int type) { this.type = type; }
}
