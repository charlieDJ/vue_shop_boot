package com.vivi.vue.shop.vo;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author dj
 * @date 2021/7/2
 */
@Getter
@Setter
public class SaveCateRequest {

    private Integer cat_pid;
    @NotEmpty(message = "名称不能为空")
    private String cat_name;
    private Integer cat_level;
}
