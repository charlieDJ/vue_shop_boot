package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the ExpressEntity type
* @author felord.cn
*/
@Data
@TableName("sp_express")
@Entity(name = "sp_express")
public class ExpressEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "express_id")
    @TableField("express_id")
    private Integer expressId;
    @Column(name = "order_id")
    @TableField("order_id")
    private Integer orderId;
    @Column(name = "express_com")
    @TableField("express_com")
    private String expressCom;
    @Column(name = "express_nu")
    @TableField("express_nu")
    private String expressNu;
    @Column(name = "create_time")
    @TableField("create_time")
    private Integer createTime;
    @Column(name = "update_time")
    @TableField("update_time")
    private Integer updateTime;

}