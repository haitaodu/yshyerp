package com.smartflow.yshyerp.crc.dto.search;

import java.util.Date;

/**
 * @author ：tao
 * @date ：Created in 2020/11/30 11:08
 * @description：${description}
 * @modified By：
 * @version: version
 */

public class searchOutAndInPage {
    int pageSize;
    int pageIndex;
    String timeBegin;
    String timeEnd;
    String coustomer;
    String type;
    String startTime;
    String endTime;

    public String getCoustomer() {
        return coustomer;
    }

    public void setCoustomer(String coustomer) {
        this.coustomer = coustomer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public String getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(String timeBegin) {
        this.timeBegin = timeBegin;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    @Override
    public String toString() {
        return "searchPage{" +
                "pageSize=" + pageSize +
                ", pageIndex=" + pageIndex +
                ", timeBegin='" + timeBegin + '\'' +
                ", timeEnd='" + timeEnd + '\'' +
                '}';
    }
}
