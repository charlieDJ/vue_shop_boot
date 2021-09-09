package com.vivi.vue.shop.controller;

import com.vivi.vue.shop.entity.UserCartEntity;
import com.vivi.vue.shop.service.UserCartService;
import com.vivi.vue.shop.utils.PageUtils;
import com.vivi.vue.shop.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;


/**
 * @author wangwei
 * @email xidian.wangwei@gmail.com
 * @date 2021-02-08 19:39:50
 */
@RestController
@RequestMapping("shop/usercart")
public class UserCartController {
    @Autowired
    private UserCartService userCartService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = userCartService.queryPage(params);

        return R.ok().setData(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{cartId}")
    public R info(@PathVariable("cartId") Integer cartId) {
        UserCartEntity userCart = userCartService.getById(cartId);

        return R.ok().setData(userCart);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody UserCartEntity userCart) {
        userCartService.save(userCart);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody UserCartEntity userCart) {
        userCartService.updateById(userCart);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] cartIds) {
        userCartService.removeByIds(Arrays.asList(cartIds));

        return R.ok();
    }

}
