package com.itom.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itom.entity.DkMessage;
import com.itom.mapper.DkMessageMapper;
import com.itom.service.IDkMessageService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 留言表 服务实现类
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Service
public class DkMessageServiceImpl extends ServiceImpl<DkMessageMapper, DkMessage> implements IDkMessageService {

}
