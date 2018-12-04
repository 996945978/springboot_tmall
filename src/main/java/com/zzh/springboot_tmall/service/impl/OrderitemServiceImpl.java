package com.zzh.springboot_tmall.service.impl;

import com.zzh.springboot_tmall.entity.Orderitem;
import com.zzh.springboot_tmall.mapper.OrderitemMapper;
import com.zzh.springboot_tmall.service.OrderitemService;
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
public class OrderitemServiceImpl extends ServiceImpl<OrderitemMapper, Orderitem> implements OrderitemService {

}
