package com.wx.islandweb.entity;

import java.util.Date;

/**
 * 动态实体类
 *
 */
public class Secret {

    private int microblogId;

    private String micContent;

    private String pictureVideo;

    private Date micReleaseTime;

    private int forwardingNum;

    private int browserNumber;

    private int reportNumber;

    public int getMicroblogId() {
        return microblogId;
    }

    public void setMicroblogId(int microblogId) {
        this.microblogId = microblogId;
    }

    public String getMicContent() {
        return micContent;
    }

    public void setMicContent(String micContent) {
        this.micContent = micContent;
    }

    public String getPictureVideo() {
        return pictureVideo;
    }

    public void setPictureVideo(String pictureVideo) {
        this.pictureVideo = pictureVideo;
    }

    public Date getMicReleaseTime() {
        return micReleaseTime;
    }

    public void setMicReleaseTime(Date micReleaseTime) {
        this.micReleaseTime = micReleaseTime;
    }

    public int getForwardingNum() {
        return forwardingNum;
    }

    public void setForwardingNum(int forwardingNum) {
        this.forwardingNum = forwardingNum;
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
}
