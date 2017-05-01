package com.admin.controller;

import com.admin.dto.PageDataGrid;
import com.admin.entity.Json;
import com.admin.entity.Order;
import com.admin.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
@Controller
@RequestMapping("admin/order")
public class OrderController {

    @Resource(name = "orderServiceImpl")
    private OrderService orderService;

    /**
     * 订单管理首页
     * @param session
     * @return
     */
    @RequestMapping("/entrance")
    public String entrance(HttpSession session){
        if (session.getAttribute("user") == null){
            return "/admin/login";
        }else{
            return "/admin/order/list";
        }
    }

    /**
     * layout首页
     * @return
     */
    @RequestMapping("/list")
    public String list(){
        return "admin/order/list";
    }

    /**
     * center table页面
     * @return
     */
    @RequestMapping("/ordertable")
    public String table(){
        return "admin/order/ordertable";
    }

    /**
     * 增加页面
     * @return
     */
    @RequestMapping("/add")
    public String add(){return "admin/order/orderadd";}

    /**
     * 获取datagrid数据
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping("/datagrid")
    @ResponseBody
    public PageDataGrid datagrid(int page,int rows){
        return orderService.list(page, rows);
    }

    /**
     * 新增订单号
     * @return
     */
    @RequestMapping("/generateOnumber")
    @ResponseBody
    public Json generateOnumber(){
        return orderService.generateOnumber();
    }

    /**
     * 新增订单
     * @param order
     * @return
     */
    @RequestMapping("/addOrder")
    @ResponseBody
    public Json addOrder(Order order){
        return orderService.addOrder(order);
    }


}
