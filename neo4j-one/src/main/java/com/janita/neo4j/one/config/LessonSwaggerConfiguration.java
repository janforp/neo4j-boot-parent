package com.janita.neo4j.one.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Janita
 * create on 2017/3/4
 * 使用swagger来管理restful接口文档
 */
@Configuration
@EnableSwagger2
public class LessonSwaggerConfiguration {

	private static final String APIPACKAGE= "com.janita.neo4j.one.controller";
	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(APIPACKAGE))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("备课模块接口管理")
                .description("备课模块接口管理")
                .termsOfServiceUrl("")
                .contact(new Contact("janita", "www.janita.cn/", ""))
                .version("v1")
                .build();
    }
}
