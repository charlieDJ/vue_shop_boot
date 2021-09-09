package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
* the OrderEntity type
* @author felord.cn
*/
@Data
@TableName("sp_order")
@Entity(name = "sp_order")
public class OrderEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    @TableField("order_id")
    private Integer orderId;
    @Column(name = "user_id")
    @TableField("user_id")
    private Integer userId;
    @Column(name = "order_number")
    @TableField("order_number")
    private String orderNumber;
    @Column(name = "order_price")
    @TableField("order_price")
    private BigDecimal orderPrice;
    @Column(name = "order_pay")
    @TableField("order_pay")
    private String orderPay;
    @Column(name = "is_send")
    @TableField("is_send")
    private String isSend;
    @Column(name = "trade_no")
    @TableField("trade_no")
    private String tradeNo;
    @Column(name = "order_fapiao_title")
    @TableField("order_fapiao_title")
    private String orderFapiaoTitle;
    @Column(name = "order_fapiao_company")
    @TableField("order_fapiao_company")
    private String orderFapiaoCompany;
    @Column(name = "order_fapiao_content")
    @TableField("order_fapiao_content")
    private String orderFapiaoContent;
    @Column(name = "consignee_addr")
    @TableField("consignee_addr")
    private String consigneeAddr;
    @Column(name = "pay_status")
    @TableField("pay_status")
    private String payStatus;
    @Column(name = "create_time")
    @TableField("create_time")
    private Date createTime;
    @Column(name = "update_time")
    @TableField("update_time")
    private Date updateTime;

}