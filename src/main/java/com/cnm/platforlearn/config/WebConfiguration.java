package com.cnm.platforlearn.config;

import com.cnm.platforlearn.interceptor.DemoInterceptor;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootConfiguration
public class WebConfiguration implements WebMvcConfigurer {


    /**
     * 增加拦截器配置
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new DemoInterceptor()).addPathPatterns("/*").excludePathPatterns("/aaa*").order(0);
    }
}
