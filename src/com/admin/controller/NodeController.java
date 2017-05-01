package com.admin.controller;

import com.admin.dto.EasyUITreeNode;
import com.admin.service.NodeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
@Controller
@RequestMapping("admin/node")
public class NodeController {

    @Resource(name = "nodeServiceImpl")
    private NodeService nodeService;
    @RequestMapping("display")
    @ResponseBody
    public List<EasyUITreeNode> display(String id){
        return nodeService.findNode(id);
    }
}
