package com.admin.service;

import com.admin.dto.EasyUITreeNode;

import java.util.List;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
public interface NodeService {
    List<EasyUITreeNode> findNode(String id);
}
