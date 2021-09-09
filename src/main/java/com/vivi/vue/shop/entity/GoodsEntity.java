package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
* the GoodsEntity type
* @author felord.cn
*/
@Data
@TableName("sp_goods")
@Entity(name = "sp_goods")
public class GoodsEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "goods_id")
    @TableField("goods_id")
    private Integer goodsId;
    @Column(name = "goods_name")
    @TableField("goods_name")
    private String goodsName;
    @Column(name = "goods_price")
    @TableField("goods_price")
    private BigDecimal goodsPrice;
    @Column(name = "goods_number")
    @TableField("goods_number")
    private Integer goodsNumber;
    @Column(name = "goods_weight")
    @TableField("goods_weight")
    private Integer goodsWeight;
    @Column(name = "cat_id")
    @TableField("cat_id")
    private Integer catId;
    @Column(name = "goods_introduce")
    @TableField("goods_introduce")
    private String goodsIntroduce;
    @Column(name = "goods_big_logo")
    @TableField("goods_big_logo")
    private String goodsBigLogo;
    @Column(name = "goods_small_logo")
    @TableField("goods_small_logo")
    private String goodsSmallLogo;
    @Column(name = "is_del")
    @TableField("is_del")
    private String isDel;
    @Column(name = "add_time")
    @TableField("add_time")
    private Date addTime;
    @Column(name = "upd_time")
    @TableField("upd_time")
    private Date updTime;
    @Column(name = "delete_time")
    @TableField("delete_time")
    private Date deleteTime;
    @Column(name = "cat_one_id")
    @TableField("cat_one_id")
    private Integer catOneId;
    @Column(name = "cat_two_id")
    @TableField("cat_two_id")
    private Integer catTwoId;
    @Column(name = "cat_three_id")
    @TableField("cat_three_id")
    private Integer catThreeId;
    @Column(name = "hot_number")
    @TableField("hot_number")
    private Integer hotNumber;
    @Column(name = "is_promote")
    @TableField("is_promote")
    private Integer isPromote;
    @Column(name = "goods_state")
    @TableField("goods_state")
    private Integer goodsState;

}