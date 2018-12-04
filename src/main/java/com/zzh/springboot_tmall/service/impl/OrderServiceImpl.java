package com.zzh.springboot_tmall.service.impl;

import com.zzh.springboot_tmall.entity.Order;
import com.zzh.springboot_tmall.mapper.OrderMapper;
import com.zzh.springboot_tmall.service.OrderService;
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
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
