package com.vivi.vue.shop.controller;

import com.vivi.vue.shop.entity.OrderGoodsEntity;
import com.vivi.vue.shop.service.OrderGoodsService;
import com.vivi.vue.shop.utils.PageUtils;
import com.vivi.vue.shop.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 商品订单关联表
 *
 * @author wangwei
 * @email xidian.wangwei@gmail.com
 * @date 2021-02-08 19:39:50
 */
@RestController
@RequestMapping("shop/ordergoods")
public class OrderGoodsController {
    @Autowired
    private OrderGoodsService orderGoodsService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = orderGoodsService.queryPage(params);

        return R.ok().setData(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		OrderGoodsEntity orderGoods = orderGoodsService.getById(id);

        return R.ok().setData(orderGoods);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrderGoodsEntity orderGoods){
		orderGoodsService.save(orderGoods);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrderGoodsEntity orderGoods){
		orderGoodsService.updateById(orderGoods);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		orderGoodsService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
