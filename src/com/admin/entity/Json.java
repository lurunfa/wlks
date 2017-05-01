package com.admin.entity;

import java.io.Serializable;

/**
 * Json交互类
 *
 * @author lurunfa
 * @version 1.0
 */
public class Json implements Serializable {

    private static final long serialVersionUID = -5026511444905479045L;
    private String message;
    private Boolean success;
    private Object object;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
