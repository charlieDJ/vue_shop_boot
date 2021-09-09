package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
* the ManagerEntity type
* @author felord.cn
*/
@Data
@TableName("sp_manager")
@Entity(name = "sp_manager")
public class ManagerEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mg_id")
    @TableField("mg_id")
    private Integer mgId;
    @Column(name = "mg_name")
    @TableField("mg_name")
    private String mgName;
    @Column(name = "mg_pwd")
    @TableField("mg_pwd")
    private String mgPwd;
    @Column(name = "mg_time")
    @TableField("mg_time")
    private Date mgTime;
    @Column(name = "role_id")
    @TableField("role_id")
    private Integer roleId;
    @Column(name = "mg_mobile")
    @TableField("mg_mobile")
    private String mgMobile;
    @Column(name = "mg_email")
    @TableField("mg_email")
    private String mgEmail;
    @Column(name = "mg_state")
    @TableField("mg_state")
    private Integer mgState;

}