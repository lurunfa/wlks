package com.admin.entity;
import java.io.Serializable;
import java.sql.Date;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
public class Order implements Serializable{
    private static final long serialVersionUID = 9118181383590229214L;

    private Long oid;

    private String onumber;

    private Date orderDate;

    private Float money;



    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }



    public String getOnumber() {
        return onumber;
    }

    public void setOnumber(String onumber) {
        this.onumber = onumber;
    }
}
