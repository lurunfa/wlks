package com.admin.dao;

import com.admin.dto.EasyUITreeNode;
import com.admin.entity.EasyUINodeEntity;

import java.util.List;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
public interface NodeDao {

    List<EasyUINodeEntity> findByPid(String pid);
}
