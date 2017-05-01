package com.admin.dto;

import java.io.Serializable;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
public class PageDataGrid implements Serializable{

    private static final long serialVersionUID = -2870442423593658450L;
    private Object rows;
    private int total;

    public Object getRows() {
        return rows;
    }

    public void setRows(Object rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
