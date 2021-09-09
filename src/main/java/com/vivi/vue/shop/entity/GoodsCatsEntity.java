package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the GoodsCatsEntity type
* @author felord.cn
*/
@Data
@TableName("sp_goods_cats")
@Entity(name = "sp_goods_cats")
public class GoodsCatsEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cat_id")
    @TableField("cat_id")
    private Integer catId;
    @Column(name = "parent_id")
    @TableField("parent_id")
    private Integer parentId;
    @Column(name = "cat_name")
    @TableField("cat_name")
    private String catName;
    @Column(name = "is_show")
    @TableField("is_show")
    private Integer isShow;
    @Column(name = "cat_sort")
    @TableField("cat_sort")
    private Integer catSort;
    @Column(name = "data_flag")
    @TableField("data_flag")
    private Integer dataFlag;
    @Column(name = "create_time")
    @TableField("create_time")
    private Integer createTime;

}