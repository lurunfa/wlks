package com.admin.service.impl;
import com.admin.dao.UserDao;
import com.admin.entity.Json;
import com.admin.entity.User;
import com.admin.service.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;

/**
 * 登录业务类实现
 *
 * @author lurunfa
 * @version 1.0
 */
@Service("loginServiceImpl")//名称注解，若不写则通过类名称来匹配
public class LoginServiceImpl implements LoginService {

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    //事务管理
    @Transactional
    @Override
    public Json isValid(String name, String password) {
        Json json = new Json();
        User user = userDao.findByName(name);
        if (user == null){
            json.setMessage("不存在用户");
            json.setSuccess(false);
            return json;
        }
        String password1 = user.getPassword();
        if (!password.equals(password1)){
            json.setMessage("密码错误");
            json.setSuccess(false);
            return json;
        }
        json.setSuccess(true);
        json.setMessage("登录成功");
        json.setObject(user);
        return json;
    }
}
