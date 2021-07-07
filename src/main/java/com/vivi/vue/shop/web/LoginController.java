package com.vivi.vue.shop.web;

import com.vivi.vue.shop.service.LoginService;
import com.vivi.vue.shop.utils.R;
import com.vivi.vue.shop.vo.LoginVO;
import com.vivi.vue.shop.vo.LoginRespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author wangwei
 * 2021/2/8 22:52
 *
 * 处理登录请求
 */
@RestController
@Validated
public class LoginController {

    @Autowired
    LoginService loginService;

    /**
     * 登录接口
     * @param loginVO
     * @return
     */
    @PostMapping("/login")
    public R login(@Valid @RequestBody LoginVO loginVO) {
        LoginRespVO infoVO = loginService.login(loginVO);
        return R.ok().setMsg("登录成功").setData(infoVO);
    }
}
