package com.itom.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itom.entity.DkUser;
import com.itom.mapper.DkUserMapper;
import com.itom.service.IDkUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author squidward
 * @since 2025-06-04
 */
@Service
public class DkUserServiceImpl extends ServiceImpl<DkUserMapper, DkUser> implements IDkUserService {

}
