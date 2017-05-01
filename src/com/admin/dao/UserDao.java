package com.admin.dao;

import com.admin.entity.User;

/**
 * 用户DAO接口
 *
 * @author lurunfa
 * @version 1.0
 */
public interface UserDao {

    /**
     * 新增一个User
     *
     * @param user
     * @return 0失败 1成功
     */
    int save(User user);

    /**
     * 通过名字查询
     *
     * @param name
     * @return null 不存在
     */
    User findByName(String name);

}
