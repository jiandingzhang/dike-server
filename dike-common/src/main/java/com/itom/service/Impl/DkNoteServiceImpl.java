package com.itom.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itom.entity.DkNote;
import com.itom.mapper.DkNoteMapper;
import com.itom.service.IDkNoteService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客笔记表 服务实现类
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Service
public class DkNoteServiceImpl extends ServiceImpl<DkNoteMapper, DkNote> implements IDkNoteService {

}
