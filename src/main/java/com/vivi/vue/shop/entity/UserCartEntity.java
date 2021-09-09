package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
* the UserCartEntity type
* @author felord.cn
*/
@Data
@TableName("sp_user_cart")
@Entity(name = "sp_user_cart")
public class UserCartEntity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    @TableField("cart_id")
    private Integer cartId;
    @Column(name = "user_id")
    @TableField("user_id")
    private Integer userId;
    @Column(name = "cart_info")
    @TableField("cart_info")
    private String cartInfo;
    @Column(name = "created_at")
    @TableField("created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    @TableField("updated_at")
    private Date updatedAt;
    @Column(name = "delete_time")
    @TableField("delete_time")
    private Date deleteTime;

}