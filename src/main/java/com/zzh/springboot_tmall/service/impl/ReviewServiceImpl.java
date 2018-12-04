package com.zzh.springboot_tmall.service.impl;

import com.zzh.springboot_tmall.entity.Review;
import com.zzh.springboot_tmall.mapper.ReviewMapper;
import com.zzh.springboot_tmall.service.ReviewService;
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
public class ReviewServiceImpl extends ServiceImpl<ReviewMapper, Review> implements ReviewService {

}
