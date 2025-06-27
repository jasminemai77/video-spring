package org.example.video.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class GlobalCorsConfig implements WebMvcConfigurer {

    /**
     * 配置全局跨域支持
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")          // 允许所有接口跨域
                .allowedOriginPatterns("*")  // 允许所有域名访问，Spring Boot 2.4+ 推荐用allowedOriginPatterns代替allowedOrigins
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // 允许的方法
                .allowedHeaders("*")         // 允许所有请求头
                .allowCredentials(true)      // 允许携带cookie
                .maxAge(3600);               // 预检请求缓存时间（秒）
    }
}
