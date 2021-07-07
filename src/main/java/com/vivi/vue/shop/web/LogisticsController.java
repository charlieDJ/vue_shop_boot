package com.vivi.vue.shop.web;

import com.vivi.vue.shop.exception.BizCodeEnum;
import com.vivi.vue.shop.utils.R;
import com.vivi.vue.shop.vo.DeliveryNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangwei
 * 2021/2/11 19:23
 */
@RestController
public class LogisticsController {

    /**
     * 查询快递物流信息
     *
     * @param id 运单号
     * @return
     */
    @GetMapping("/kuaidi/{id}")
    public R<List<DeliveryNode>> logistics(@PathVariable("id") String id) {
        List<DeliveryNode> nodes = getNodes();
        return R.ok().setMsg("获取成功").setData(nodes);
    }

    private List<DeliveryNode> getNodes() {
        List<DeliveryNode> nodes = new ArrayList<>();
        LocalDateTime time = LocalDateTime.now();
        for (int i = 0; i < 10; i++) {
            LocalDateTime newTime = time.plusHours(1);
            DeliveryNode node = new DeliveryNode();
            node.setDateTime(newTime);
            node.setContext("快件正在发货，进度：100%");
            node.setLocation("");
            nodes.add(node);
            time = newTime;
        }
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        List<DeliveryNode> collect = nodes.stream()
                .map(e -> {
                    e.setTime(df.format(e.getDateTime()));
                    e.setFtime(df.format(e.getDateTime()));
                    return e;
                }).sorted(Comparator.comparing(DeliveryNode::getDateTime).reversed())
                .collect(Collectors.toList());
        return collect;
    }
}
