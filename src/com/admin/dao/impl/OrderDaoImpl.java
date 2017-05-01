package com.admin.dao.impl;

import com.admin.dao.OrderDao;
import com.admin.entity.Order;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lurunfa on 2017/4/30.
 *
 * @author lurunfa
 * @version 1.0
 */
@Repository("orderDaoImpl")
public class OrderDaoImpl implements OrderDao{

    @Resource
    private JdbcTemplate jdbcTemplate;
    @Override
    public List<Order> list(int page, int row) {
        return jdbcTemplate.query("SELECT * FROM t_order LIMIT "+((page-1)*row)+","+row,new OrderRowMapper());
    }

    @Override
    public int count() {
        try{
          return jdbcTemplate.queryForObject("select count(*) from t_order", Integer.class);
        }
        catch (EmptyResultDataAccessException e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int addOrder(Order order){
        int update = jdbcTemplate.update("INSERT INTO t_order(onumber,orderDate,money) VALUES (?,?,?)", order.getOnumber(), order.getOrderDate(), order.getMoney());
        return update;
    }

    private class OrderRowMapper implements RowMapper<Order>{

        @Override
        public Order mapRow(ResultSet resultSet, int i) throws SQLException {
            Order order = new Order();
            order.setOid(resultSet.getLong(1));
            order.setOnumber(resultSet.getString(2));
            order.setOrderDate(resultSet.getDate(3));
            order.setMoney(resultSet.getFloat(4));
            return order;
        }
    }
}
