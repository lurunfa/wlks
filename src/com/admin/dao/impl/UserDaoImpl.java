package com.admin.dao.impl;

import com.admin.dao.UserDao;
import com.admin.entity.User;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 用户DAO类
 *
 * @author lurunfa
 * @version 1.0
 */
@Repository("userDaoImpl")
public class UserDaoImpl implements UserDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public int save(User user) {
        //  if (findByName(user.getUsername())!=null){return 0;}
        return jdbcTemplate.update("INSERT INTO t_user(username,password) VALUES (?,?)", user.getUsername(), user.getPassword());
    }

    @Override
    public User findByName(String name) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM t_user WHERE username = ?", new Object[]{name}, new UserRowMapper());
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    /**
     * 自动将查询的值构建实体类
     */
    private class UserRowMapper implements RowMapper<User> {

        @Override
        public User mapRow(ResultSet resultSet, int i) throws SQLException {
            User user = new User();
            user.setUsername(resultSet.getString(2));
            user.setPassword(resultSet.getString(3));
            return user;
        }
    }
}
