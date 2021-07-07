package com.vivi.vue.shop.vo;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author dj
 * @date 2021/7/6
 */
@Getter
@Setter
public class DeliveryNode {
    private String time;
    private String ftime;
    private String context;
    private String location;
    private LocalDateTime dateTime;
}
