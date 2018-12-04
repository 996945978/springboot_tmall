package com.zzh.springboot_tmall.service.impl;

import com.zzh.springboot_tmall.entity.Property;
import com.zzh.springboot_tmall.mapper.PropertyMapper;
import com.zzh.springboot_tmall.service.PropertyService;
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
public class PropertyServiceImpl extends ServiceImpl<PropertyMapper, Property> implements PropertyService {

}
