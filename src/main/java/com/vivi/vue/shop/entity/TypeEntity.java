package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the TypeEntity type
* @author felord.cn
*/
@Data
@TableName("sp_type")
@Entity(name = "sp_type")
public class TypeEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    @TableField("type_id")
    private Integer typeId;
    @Column(name = "type_name")
    @TableField("type_name")
    private String typeName;
    @Column(name = "delete_time")
    @TableField("delete_time")
    private Integer deleteTime;

}