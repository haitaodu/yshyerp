package com.smartflow.yshyerp.crc.config;


import config.BaseSwaggerConfig;
import domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 * Created by macro on 2018/4/26.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.smartflow.yshyerp.crc.controller")
                .title("crc后台系统")
                .description("crc后台相关接口文档")
                .contactName("杜海涛")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }
}
