package ru.stoloto.testwebapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Класс конфигурации прилодения - преобразовать mvc-config.xml
 * в аналогичный по функционалу Java класс с использованием аннотаций
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Configuration
@EnableWebMvc
@ComponentScan("ru.stoloto.testwebapp")
public class AppConfig implements WebMvcConfigurer {

    /**
     * Метод конфигурации бина ResourceHandlerRegistry - обработчик ресурсов
     * который указываетприложнгию, где находятся статические страницы jsp.
     * @param registry - обработчик ресурсов для обслуживания статических ресурсов,
     * таких как изображения, файлы CSS и другие, через Spring MVC
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("*.jsp/")
                .addResourceLocations("classpath:/META-INF/jsp/");
    }

}
