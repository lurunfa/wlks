package com.admin.entity;

import java.util.List;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
public class EasyUINodeEntity {

    private String id;
    private String text;
    private String pid;
    private String url;
    private String iconCls;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }


    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }
}
