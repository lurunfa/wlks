package com.admin.dao;

import com.admin.entity.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by lurunfa on 2017/4/29.
 *
 * @author lurunfa
 * @version 1.0
 */
public interface TestDao {
    int save(User user);
    void createTable(String tbName) throws Exception;
    Boolean isExitTable(String tbName) throws SQLException;
    List<User> queryAll();
}
