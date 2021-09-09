package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;

/**
* the AttributeEntity type
* @author felord.cn
*/
@Data
@TableName("sp_attribute")
@Entity(name = "sp_attribute")
public class AttributeEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attr_id")
    @TableField("attr_id")
    private Integer attrId;
    @Column(name = "attr_name")
    @TableField("attr_name")
    private String attrName;
    @Column(name = "cat_id")
    @TableField("cat_id")
    private Integer catId;
    @Column(name = "attr_sel")
    @TableField("attr_sel")
    private String attrSel;
    @Column(name = "attr_write")
    @TableField("attr_write")
    private String attrWrite;
    @Column(name = "attr_vals")
    @TableField("attr_vals")
    private String attrVals;
    @Column(name = "delete_time")
    @TableField("delete_time")
    private Integer deleteTime;

}