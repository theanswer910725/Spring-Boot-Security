package com.BONC.interceptor;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

public class WebConfig extends WebMvcConfigurerAdapter {
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
     //   registry.addInterceptor(new LocaleInterceptor());
     //   registry.addInterceptor(new ThemeInterceptor()).addPathPatterns("/**").excludePathPatterns("/admin/**");
     //   registry.addInterceptor(new SecurityInterceptor()).addPathPatterns("/secure/*");
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/posts/create");
	}
	
}
