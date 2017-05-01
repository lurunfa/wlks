package com.admin.service;

import com.admin.dto.PageDataGrid;
import com.admin.entity.Json;
import com.admin.entity.Order;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
public interface OrderService {

    PageDataGrid list(int page,int rows);

    Json generateOnumber();

    Json addOrder(Order order);
}
