package com.itom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itom.entity.DkMessage;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * 留言表 Mapper 接口
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Mapper
public interface DkMessageMapper extends BaseMapper<DkMessage> {

}

