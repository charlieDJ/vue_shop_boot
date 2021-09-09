package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
* the Report2Entity type
* @author felord.cn
*/
@Data
@TableName("sp_report_2")
@Entity(name = "sp_report_2")
public class Report2Entity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @TableField("id")
    private Integer id;
    @Column(name = "rp2_page")
    @TableField("rp2_page")
    private String rp2Page;
    @Column(name = "rp2_count")
    @TableField("rp2_count")
    private Integer rp2Count;
    @Column(name = "rp2_date")
    @TableField("rp2_date")
    private Date rp2Date;

}