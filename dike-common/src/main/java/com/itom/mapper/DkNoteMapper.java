package com.itom.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itom.entity.DkNote;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * 博客笔记表 Mapper 接口
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Mapper
public interface DkNoteMapper extends BaseMapper<DkNote> {

}

