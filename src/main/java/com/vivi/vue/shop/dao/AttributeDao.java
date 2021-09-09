package com.vivi.vue.shop.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.vivi.vue.shop.entity.AttributeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性表
 * 
 * @author wangwei
 * @email xidian.wangwei@gmail.com
 * @date 2021-02-08 19:39:50
 */
@Mapper
public interface AttributeDao extends BaseMapper<AttributeEntity> {
	
}
