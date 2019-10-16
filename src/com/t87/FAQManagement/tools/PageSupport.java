package com.t87.FAQManagement.tools;

/**
 * 分页-JavaBean
 */
public class PageSupport {

    //当前页码
    private int currentPageNo = 1;

    //总记录数
    private int totalCount = 0;

    //页面大小
    private int pageSize = 0;

    //总记录数%页面大小==0?整除:不能整除+1=总页数
    private int totalPageCount = 1;


    public int getCurrentPageNo() {
        return currentPageNo;
    }

    public void setCurrentPageNo(int currentPageNo) {
        if (currentPageNo>0){
            this.currentPageNo = currentPageNo;
        }
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        if (totalCount>0){
            this.totalCount = totalCount;
            //设置总页数
            this.totalPageCount=totalCount%this.pageSize==0?totalCount/this.pageSize:totalCount/this.pageSize+1;
        }
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
}
