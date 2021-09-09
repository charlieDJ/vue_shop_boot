package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

/**
* the OrderGoodsEntity type
* @author felord.cn
*/
@Data
@TableName("sp_order_goods")
@Entity(name = "sp_order_goods")
public class OrderGoodsEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @TableField("id")
    private Integer id;
    @Column(name = "order_id")
    @TableField("order_id")
    private Integer orderId;
    @Column(name = "goods_id")
    @TableField("goods_id")
    private Integer goodsId;
    @Column(name = "goods_price")
    @TableField("goods_price")
    private BigDecimal goodsPrice;
    @Column(name = "goods_number")
    @TableField("goods_number")
    private Integer goodsNumber;
    @Column(name = "goods_total_price")
    @TableField("goods_total_price")
    private BigDecimal goodsTotalPrice;

}