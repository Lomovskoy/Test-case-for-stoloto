package ru.stoloto.testwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Объект конфигурации View Resolver -
 * определяет какое представление необходимо отобразить для определенного запроса, по заданному имени.
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Configuration
public class ViewResolverConfig {

    /**
     * Метод отдаёт сконфигурированный View Resolver, который смотрит в контекст прилодения,
     * в папку /WEB-INF/jsp/, и ищет там файл с заданныи именем и разщирением .jsp
     * @return InternalResourceViewResolver - по умолчанию реализацией интерфейса ViewResolver
     */
    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        return new InternalResourceViewResolver("/WEB-INF/jsp/", ".jsp");
    }

}
