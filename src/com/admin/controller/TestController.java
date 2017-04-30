package com.admin.controller;

import com.admin.entity.User;
import com.admin.service.TestService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by lurunfa on 2017/4/29.
 *
 * @author lurunfa
 * @version 1.0
 */
@Controller
@RequestMapping("/admin/test")
public class TestController {

    @Resource(name = "testServiceImpl")
    private TestService testService;

    private Logger logger = Logger.getLogger(TestController.class);
    @RequestMapping("/test")
    public String test(){
        logger.warn(testService.queryAll().size());
        return "test";
    }
}
