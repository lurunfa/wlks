package com.admin.service.impl;

import com.admin.dao.OrderDao;
import com.admin.dto.PageDataGrid;
import com.admin.entity.Json;
import com.admin.entity.Order;
import com.admin.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {

    @Resource(name = "orderDaoImpl")
    private OrderDao orderDao;

    @Override
    public PageDataGrid list(int page, int rows) {
        List<Order> list = orderDao.list(page, rows);
        PageDataGrid pageDataGrid = new PageDataGrid();
        pageDataGrid.setRows(list);
        pageDataGrid.setTotal(orderDao.count());
        return pageDataGrid;
    }

    @Override
    public Json generateOnumber(){
        int random = (int) (Math.random()*10000);
        Date date = new Date(System.currentTimeMillis());
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String format = dateFormat.format(date);
        Json json = new Json();
        json.setSuccess(true);
        json.setObject(format+random);
        return json;
    }

    @Override
    public Json addOrder(Order order){
        Json json = new Json();
        int i = orderDao.addOrder(order);
        if(i == 0){
            json.setMessage("失败");
            return json;
        }
        json.setSuccess(true);
        json.setMessage("成功");
        return json;
    }
}
