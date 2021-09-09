package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the RoleEntity type
* @author felord.cn
*/
@Data
@TableName("sp_role")
@Entity(name = "sp_role")
public class RoleEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    @TableField("role_id")
    private Integer roleId;
    @Column(name = "role_name")
    @TableField("role_name")
    private String roleName;
    @Column(name = "ps_ids")
    @TableField("ps_ids")
    private String psIds;
    @Column(name = "ps_ca")
    @TableField("ps_ca")
    private String psCa;
    @Column(name = "role_desc")
    @TableField("role_desc")
    private String roleDesc;

}