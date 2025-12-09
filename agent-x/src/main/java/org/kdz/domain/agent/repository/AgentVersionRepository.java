package org.kdz.domain.agent.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.kdz.domain.agent.model.AgentVersionEntity;

/**
 * Agent版本仓库接口
 */
@Mapper
public interface AgentVersionRepository extends BaseMapper<AgentVersionEntity> {
}
