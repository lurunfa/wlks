package com.sample.service;

import com.admin.entity.User;

import java.util.List;

/**
 * Created by lurunfa on 2017/4/29.
 *
 * @author lurunfa
 * @version 1.0
 */
public interface TestService {

    int save(User user);

    List<User> queryAll();
}
