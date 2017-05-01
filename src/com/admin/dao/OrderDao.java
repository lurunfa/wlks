package com.admin.dao;

import com.admin.entity.Order;

import java.util.List;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
public interface OrderDao {

    List<Order> list(int page,int row);
    int count();

    int addOrder(Order order);
}
