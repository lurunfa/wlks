package com.admin.service.impl;

import com.admin.dao.TestDao;
import com.admin.entity.User;
import com.admin.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lurunfa on 2017/4/29.
 *
 * @author lurunfa
 * @version 1.0
 */
@Service("testServiceImpl")
public class TestServiceImpl implements TestService {

    @Resource(name = "testDaoImpl")
    private TestDao testDao;

    @Override
    public int save(User user) {
        if (user == null){
            return 0;
        }
        Boolean isExit = false;
        try {
            isExit = testDao.isExitTable("user");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (isExit){
           return testDao.save(user);

        }else {
            try {
                testDao.createTable("user");
                return testDao.save(user);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public List<User> queryAll() {
        return testDao.queryAll();
    }
}
