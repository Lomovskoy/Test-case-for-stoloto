package ru.stoloto.testwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("ru.stoloto.testwebapp.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo getApiInfo(){
        return  new ApiInfo(
                "Service adapter receiving INN from the FNS website API",
                "Шаблон тестового приложения",
                "1.0.0",
                "http://javacv.h1n.ru/",
                new Contact("Кирилл", "http://javacv.h1n.ru/", "lomovskoy.kirill@yandex.ru"),
                "Кирилл",
                "http://javacv.h1n.ru/", new ArrayList());
    }
}

