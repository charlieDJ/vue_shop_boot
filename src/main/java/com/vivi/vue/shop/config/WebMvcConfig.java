package com.vivi.vue.shop.config;

import com.vivi.vue.shop.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

/**
 * @author wangwei
 * 2021/2/8 21:12
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private static final List<String> EXCLUDE_PATH = Arrays.asList("/", "/index.html", "/favicon.ico",
            "/login", "/css/**", "/js/**", "/img/**", "/fonts/**");

    /**
     * 允许跨域
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowedOrigins("*")
                .maxAge(3600);
    }

    /**
     * 注册拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new AuthenticationInterceptor())
                .addPathPatterns("/**").excludePathPatterns(EXCLUDE_PATH);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
