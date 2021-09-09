package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the PermissionEntity type
* @author felord.cn
*/
@Data
@TableName("sp_permission")
@Entity(name = "sp_permission")
public class PermissionEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ps_id")
    @TableField("ps_id")
    private Integer psId;
    @Column(name = "ps_name")
    @TableField("ps_name")
    private String psName;
    @Column(name = "ps_pid")
    @TableField("ps_pid")
    private Integer psPid;
    @Column(name = "ps_c")
    @TableField("ps_c")
    private String psC;
    @Column(name = "ps_a")
    @TableField("ps_a")
    private String psA;
    @Column(name = "ps_level")
    @TableField("ps_level")
    private Integer psLevel;

}