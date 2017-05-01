package com.admin.service.impl;

import com.admin.dao.NodeDao;
import com.admin.dto.EasyUITreeNode;
import com.admin.entity.EasyUINodeEntity;
import com.admin.service.NodeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
@Service("nodeServiceImpl")
public class NodeServiceImpl implements NodeService {

    @Resource(name = "nodeDaoImpl")
    private NodeDao nodeDao;


    @Override
    public List<EasyUITreeNode> findNode(String pid) {
        List<EasyUITreeNode> easyUITreeNodes = new ArrayList<>();
        List<EasyUINodeEntity> nodeEntities = nodeDao.findByPid(pid);
        for (EasyUINodeEntity easyUINodeEntity : nodeEntities) {
            EasyUITreeNode easyUITreeNode = new EasyUITreeNode();
            BeanUtils.copyProperties(easyUINodeEntity, easyUITreeNode);
            if (pid != null) {
                Map<String, Object> map = new HashMap<>();
                map.put("url", easyUINodeEntity.getUrl());
                easyUITreeNode.setAttributes(map);
                easyUITreeNode.setState("open");
            }
            easyUITreeNodes.add(easyUITreeNode);
        }
        return easyUITreeNodes;
    }
}
