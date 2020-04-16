package com.wonix.crud.config;

import com.wonix.crud.component.LoginHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer
{
    //加载静态资源
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry)
    {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    //重定向（添加视图映射）
    @Override
    public void addViewControllers(ViewControllerRegistry registry)
    {
        registry.addViewController("blog").setViewName("blog");
        registry.addViewController("/").setViewName("index");
    }

    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns("/","/index.html","/login")
                .excludePathPatterns("/**/*.css","/**/*js","/**/*.svg","/**/*.png");
    }
}
