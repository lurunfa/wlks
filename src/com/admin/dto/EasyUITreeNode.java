package com.admin.dto;

import com.admin.entity.EasyUINodeEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
public class EasyUITreeNode implements Serializable{
    private static final long serialVersionUID = 4160536501598132001L;
    private String id;
    private String text;
    private String state = "closed";
    private String pid;
    private List<EasyUINodeEntity> children;
    private String iconCls;
    private boolean checked = false;
    private Object attributes;

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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List<EasyUINodeEntity> getChildren() {
        return children;
    }

    public void setChildren(List<EasyUINodeEntity> children) {
        this.children = children;
    }

    public String getIconCls() {
        return iconCls;
    }

    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }
}
