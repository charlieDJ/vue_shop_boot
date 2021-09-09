package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the PermissionApiEntity type
* @author felord.cn
*/
@Data
@TableName("sp_permission_api")
@Entity(name = "sp_permission_api")
public class PermissionApiEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @TableField("id")
    private Integer id;
    @Column(name = "ps_id")
    @TableField("ps_id")
    private Integer psId;
    @Column(name = "ps_api_service")
    @TableField("ps_api_service")
    private String psApiService;
    @Column(name = "ps_api_action")
    @TableField("ps_api_action")
    private String psApiAction;
    @Column(name = "ps_api_path")
    @TableField("ps_api_path")
    private String psApiPath;
    @Column(name = "ps_api_order")
    @TableField("ps_api_order")
    private Integer psApiOrder;

}