package com.raise.tools.Entity;

/**
 * Created by raise.yang on 2016/05/28.
 */
public class WxArticle {

    /**
     * ctime : 2016-03-31
     * title : 奇虎360宣布通过私有化决议
     * description : 互联网头条
     * picUrl : http://t1.qpic.cn/mblogpic/f01a972dbcc1060fd456/2000
     * url : http://mp.weixin.qq.com/s?__biz=MjM5OTMyODA2MA==&idx=1&mid=402594468&sn=5cd644536b472a283cc1d3f5124a0cab
     */

    private String ctime;
    private String title;
    private String description;
    private String picUrl;
    private String url;

    public String getCtime() {
        return ctime;
    }

    public void setCtime(String ctime) {
        this.ctime = ctime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "WxArticle{" +
                "ctime='" + ctime + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
