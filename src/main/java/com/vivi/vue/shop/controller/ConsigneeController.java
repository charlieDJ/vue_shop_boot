package com.vivi.vue.shop.controller;

import com.vivi.vue.shop.entity.ConsigneeEntity;
import com.vivi.vue.shop.service.ConsigneeService;
import com.vivi.vue.shop.utils.PageUtils;
import com.vivi.vue.shop.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 收货人表
 *
 * @author wangwei
 * @email xidian.wangwei@gmail.com
 * @date 2021-02-08 19:39:50
 */
@RestController
@RequestMapping("shop/consignee")
public class ConsigneeController {
    @Autowired
    private ConsigneeService consigneeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = consigneeService.queryPage(params);

        return R.ok().setData(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{cgnId}")
    public R info(@PathVariable("cgnId") Integer cgnId){
		ConsigneeEntity consignee = consigneeService.getById(cgnId);

        return R.ok().setData(consignee);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ConsigneeEntity consignee){
		consigneeService.save(consignee);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ConsigneeEntity consignee){
		consigneeService.updateById(consignee);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] cgnIds){
		consigneeService.removeByIds(Arrays.asList(cgnIds));

        return R.ok();
    }

}
