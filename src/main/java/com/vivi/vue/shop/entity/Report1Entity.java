package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
* the Report1Entity type
* @author felord.cn
*/
@Data
@TableName("sp_report_1")
@Entity(name = "sp_report_1")
public class Report1Entity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @TableField("id")
    private Integer id;
    @Column(name = "rp1_user_count")
    @TableField("rp1_user_count")
    private Integer rp1UserCount;
    @Column(name = "rp1_area")
    @TableField("rp1_area")
    private String rp1Area;
    @Column(name = "rp1_date")
    @TableField("rp1_date")
    private Date rp1Date;

}