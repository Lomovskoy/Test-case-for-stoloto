package ru.stoloto.testwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Класс конфигурации ресурсов приложения
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Configuration
@PropertySource(value={"classpath:application.properties"}, ignoreResourceNotFound = true)
public class PropertiesConfig {

    /**
     * Специализация PropertySourcesPlaceholderConfigurer - разрешает заполнители $ {...} в значениях свойств
     * определения бина и @Value аннотации из набору ресурсов в PropertySources.
     * @return PropertySourcesPlaceholderConfigurer
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
