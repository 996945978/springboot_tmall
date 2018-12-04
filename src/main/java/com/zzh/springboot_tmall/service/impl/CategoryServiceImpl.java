package com.zzh.springboot_tmall.service.impl;

import com.zzh.springboot_tmall.entity.Category;
import com.zzh.springboot_tmall.mapper.CategoryMapper;
import com.zzh.springboot_tmall.service.CategoryService;
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
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
