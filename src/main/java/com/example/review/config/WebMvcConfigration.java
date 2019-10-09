/*
package com.example.review.config;

import com.example.review.interceptor.MyHandlerInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


@Configuration
public class WebMvcConfigration extends WebMvcConfigurationSupport {

    private static final Logger logger = LoggerFactory.getLogger(WebMvcConfigration.class);

    */
/**
     * 重写addInterceptors方法实现拦截器
     * addPathPatterns     添加拦截器规则
     * excludePathPatterns 排除用户访问拦截
     *
     * @param registry
     *//*

    */
/*@Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/", "/login");
        logger.info("-- addInterceptors方法 --");
        super.addInterceptors(registry);
    }*//*


    */
/**
     * 重写addResourceHandlers方法配置静态资源访问拦截
     *  addResourceHandler   当前项目下的所有资源 xxx当前项目
     *  addResourceLocations
     * @param registry
     *//*

    */
/*@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        //也可以写绝对路径 例如("file:c:xx")
        registry.addResourceHandler("/xxx/**").addResourceLocations("classpath:/");
        logger.info("-- addResourceHandlers方法 --");
        super.addResourceHandlers(registry);
    }*//*


    */
/**
     * 实现指定页面跳转
     * addViewController 设置项目根路径
     * setViewName       设置根路径到跳转页面
     * @param registry
     *//*

    */
/*@Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        logger.info("-- addViewControllers方法 --");
        super.addViewControllers(registry);
    }*//*

}
*/
