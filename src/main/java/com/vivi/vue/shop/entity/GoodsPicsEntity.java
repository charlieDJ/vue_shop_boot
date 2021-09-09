package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the GoodsPicsEntity type
* @author felord.cn
*/
@Data
@TableName("sp_goods_pics")
@Entity(name = "sp_goods_pics")
public class GoodsPicsEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pics_id")
    @TableField("pics_id")
    private Integer picsId;
    @Column(name = "goods_id")
    @TableField("goods_id")
    private Integer goodsId;
    @Column(name = "pics_big")
    @TableField("pics_big")
    private String picsBig;
    @Column(name = "pics_mid")
    @TableField("pics_mid")
    private String picsMid;
    @Column(name = "pics_sma")
    @TableField("pics_sma")
    private String picsSma;

}