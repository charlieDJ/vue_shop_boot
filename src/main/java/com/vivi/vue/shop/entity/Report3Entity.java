package com.vivi.vue.shop.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
* the Report3Entity type
* @author felord.cn
*/
@Data
@TableName("sp_report_3")
@Entity(name = "sp_report_3")
public class Report3Entity {

    @TableId
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @TableField("id")
    private Integer id;
    @Column(name = "rp3_src")
    @TableField("rp3_src")
    private String rp3Src;
    @Column(name = "rp3_count")
    @TableField("rp3_count")
    private Integer rp3Count;
    @Column(name = "rp3_date")
    @TableField("rp3_date")
    private Date rp3Date;

}