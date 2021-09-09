package com.vivi.vue.shop.controller;

import com.vivi.vue.shop.entity.Report2Entity;
import com.vivi.vue.shop.service.Report2Service;
import com.vivi.vue.shop.utils.PageUtils;
import com.vivi.vue.shop.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 
 *
 * @author wangwei
 * @email xidian.wangwei@gmail.com
 * @date 2021-02-08 19:39:50
 */
@RestController
@RequestMapping("shop/report2")
public class Report2Controller {
    @Autowired
    private Report2Service report2Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = report2Service.queryPage(params);

        return R.ok().setData(page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Integer id){
		Report2Entity report2 = report2Service.getById(id);

        return R.ok().setData(report2);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody Report2Entity report2){
		report2Service.save(report2);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody Report2Entity report2){
		report2Service.updateById(report2);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
		report2Service.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
