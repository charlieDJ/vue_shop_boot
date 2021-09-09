package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the ConsigneeEntity type
* @author felord.cn
*/
@Data
@TableName("sp_consignee")
@Entity(name = "sp_consignee")
public class ConsigneeEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cgn_id")
    @TableField("cgn_id")
    private Integer cgnId;
    @Column(name = "user_id")
    @TableField("user_id")
    private Integer userId;
    @Column(name = "cgn_name")
    @TableField("cgn_name")
    private String cgnName;
    @Column(name = "cgn_address")
    @TableField("cgn_address")
    private String cgnAddress;
    @Column(name = "cgn_tel")
    @TableField("cgn_tel")
    private String cgnTel;
    @Column(name = "cgn_code")
    @TableField("cgn_code")
    private String cgnCode;
    @Column(name = "delete_time")
    @TableField("delete_time")
    private Integer deleteTime;

}