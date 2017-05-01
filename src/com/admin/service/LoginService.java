package com.admin.service;

import com.admin.entity.Json;

/**
 * 登录业务类接口
 *
 * @author lurunfa
 * @version 1.0
 */
public interface LoginService {
    /**
     * 登录验证账户密码
     *
     * @param name
     * @param password
     * @return Json交互类
     */
    Json isValid(String name, String password);
}
