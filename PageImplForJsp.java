package com.youedata.util.page;

import java.util.List;

/**
 * Created by Administrator on 2016/3/9 0009.
 */
public class PageImplForJsp<T> extends PageImpl<T> {

    private String baseUrl;

    public PageImplForJsp(List<T> rows, Pageable pageable, long total) {
        super(rows, pageable, total);
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public int getPageNumber() {
        return this.pageable.getPageNumber();
    }

    public boolean hasPre(){
        return getPageNumber()!=0;
    }

    public boolean hasNext(){
        return getPageNumber() != getTotalPages()-1;
    }

}
