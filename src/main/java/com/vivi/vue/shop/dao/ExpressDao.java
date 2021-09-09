package com.vivi.vue.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vivi.vue.shop.entity.ExpressEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 快递表
 * 
 * @author wangwei
 * @email xidian.wangwei@gmail.com
 * @date 2021-02-08 19:39:50
 */
@Mapper
public interface ExpressDao extends BaseMapper<ExpressEntity> {
	
}
