package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
* the GoodsAttrEntity type
* @author felord.cn
*/
@Data
@TableName("sp_goods_attr")
@Entity(name = "sp_goods_attr")
public class GoodsAttrEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @TableField("id")
    private Integer id;
    @Column(name = "goods_id")
    @TableField("goods_id")
    private Integer goodsId;
    @Column(name = "attr_id")
    @TableField("attr_id")
    private Integer attrId;
    @Column(name = "attr_value")
    @TableField("attr_value")
    private String attrValue;
    @Column(name = "add_price")
    @TableField("add_price")
    private BigDecimal addPrice;

}