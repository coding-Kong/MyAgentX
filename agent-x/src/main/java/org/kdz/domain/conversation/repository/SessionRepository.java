package org.kdz.domain.conversation.repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.kdz.domain.conversation.model.Session;

/**
 * 会话仓库接口
 */
@Mapper
public interface SessionRepository extends BaseMapper<Session> {

}
