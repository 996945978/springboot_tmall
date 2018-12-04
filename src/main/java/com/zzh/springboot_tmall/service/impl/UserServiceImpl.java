package com.zzh.springboot_tmall.service.impl;

import com.zzh.springboot_tmall.entity.User;
import com.zzh.springboot_tmall.mapper.UserMapper;
import com.zzh.springboot_tmall.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzh
 * @since 2018-12-04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
