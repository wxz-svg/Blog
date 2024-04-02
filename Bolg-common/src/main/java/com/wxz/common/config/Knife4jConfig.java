package com.wxz.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.Collections;


/**
 * Knife4j配置类，用于启用和配置Swagger2文档生成工具。
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {

    /**
     * 创建REST API的Docket Bean。
     *
     * @return Docket配置实例
     */
    @Bean
    public Docket createRestApi() {
        // Docket实例的配置
        return new Docket(DocumentationType.SWAGGER_2)
                .protocols(Collections.singleton("https")) // 设置支持的协议
                .host("https://www.xxx.com") // 设置文档的主机地址
                .apiInfo(apiInfo()) // 设置API的基本信息
                .select() // 返回一个ApiSelectorBuilder实例，用来控制那些接口暴露给Swagger来展现
                .apis(RequestHandlerSelectors.basePackage("com.wxz")) // 指定扫描的包路径来定义要展示的API
                .paths(PathSelectors.any()) // 指定路径处理PathSelectors.any()代表所有的路径
                .build(); // 创建Docket实例
    }

    /**
     * 创建API的基本信息
     *
     * @return 返回构建好的ApiInfo实例
     */
    private ApiInfo apiInfo() {
        // 构建API文档的详细信息
        return new ApiInfoBuilder()
                .title("nevi文档") // 设置文档标题
                .description("aurora") // 设置文档描述
                .contact(new Contact("wxz", "", "3337876732@qq.com")) // 设置文档的作者信息
                .termsOfServiceUrl("https://www.xxx.com") // 设置服务条款网址
                .version("1.0") // 设置文档版本号
                .build(); // 构建
    }

}


