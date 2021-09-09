package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the CategoryEntity type
* @author felord.cn
*/
@Data
@TableName("sp_category")
@Entity(name = "sp_category")
public class CategoryEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    @TableField("cat_id")
    private Integer catId;
    @Column(name = "cat_name")
    @TableField("cat_name")
    private String catName;
    @Column(name = "cat_pid")
    @TableField("cat_pid")
    private Integer catPid;
    @Column(name = "cat_level")
    @TableField("cat_level")
    private Integer catLevel;
    @Column(name = "cat_deleted")
    @TableField("cat_deleted")
    private Integer catDeleted;
    @Column(name = "cat_icon")
    @TableField("cat_icon")
    private String catIcon;
    @Column(name = "cat_src")
    @TableField("cat_src")
    private String catSrc;

}