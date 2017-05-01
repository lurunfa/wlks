package com.admin.dao.impl;

import com.admin.dao.NodeDao;
import com.admin.entity.EasyUINodeEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by lurunfa on 2017/5/1.
 *
 * @author lurunfa
 * @version 1.0
 */
@Repository("nodeDaoImpl")
public class NodeDaoImpl implements NodeDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<EasyUINodeEntity> findByPid(String pid) {
        if (pid == null){
            return jdbcTemplate.query("SELECT * FROM t_node WHERE pid is NULL ", new NodeRowMapper());
        }
        return jdbcTemplate.query("SELECT * FROM t_node WHERE pid = ?", new Object[]{pid}, new NodeRowMapper());
    }

    private class NodeRowMapper implements RowMapper<EasyUINodeEntity>{
        @Override
        public EasyUINodeEntity mapRow(ResultSet resultSet, int i) throws SQLException {
            EasyUINodeEntity easyUINodeEntity = new EasyUINodeEntity();
            easyUINodeEntity.setId(resultSet.getString(1));
            easyUINodeEntity.setUrl(resultSet.getString(2));
            easyUINodeEntity.setIconCls(resultSet.getString(3));
            easyUINodeEntity.setPid(resultSet.getString(4));
            easyUINodeEntity.setText(resultSet.getString(5));
            return easyUINodeEntity;
        }
    }
}
