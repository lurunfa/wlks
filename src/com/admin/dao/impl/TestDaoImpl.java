package com.admin.dao.impl;

import com.admin.dao.TestDao;
import com.admin.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.*;
import java.util.List;

/**
 * Created by lurunfa on 2017/4/29.
 *
 * @author lurunfa
 * @version 1.0
 */
@Repository("testDaoImpl")
public class TestDaoImpl implements TestDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Resource
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int save(User user) {

        int update = jdbcTemplate.update("INSERT INTO t_user VALUES (?,?)",
                new Object[]{user.getUserName(), user.getPassword()}
                );
        return update;

    }

    @Override
    public void createTable(String tbName) throws Exception{
       if (!isExitTable(tbName)){
           String sql = "CREATE TABLE `t_"+tbName+"` (" +
                   " `id` int(11) NOT NULL AUTO_INCREMENT," +
                   "`username` varchar(255)," +
                   "`password` varchar(255)," +
                   " PRIMARY KEY (`id`))" +
                   " ENGINE=InnoDB DEFAULT CHARSET=utf8";
           jdbcTemplate.execute(sql);
       }
    }

    @Override
    public Boolean isExitTable(String tbName) throws SQLException {
        //查询是否有对应的表，如果有则删除
        Connection connection = jdbcTemplate.getDataSource().getConnection();
        ResultSet tables = null;
        try {
            DatabaseMetaData metaData = connection.getMetaData();
            String[] type = {"TABLE"};
            tables = metaData.getTables(null, null, tbName, type);
            if (tables.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            tables.close();
            connection.close();
        }
        return false;
    }

    @Override
    public List<User> queryAll() {
        return jdbcTemplate.query("SELECT * FROM t_user",new UserRowMapper());
    }

    private class UserRowMapper implements RowMapper<User>{

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUserName(resultSet.getString(1));
            user.setPassword(resultSet.getString(2));
            return user;
        }
    }

}
