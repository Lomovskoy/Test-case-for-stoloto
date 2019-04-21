package ru.stoloto.testwebapp.config;

import feign.Feign;
import feign.Logger;
import feign.form.FormEncoder;
import feign.gson.GsonDecoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.stoloto.testwebapp.resitory.NalogRepository;

/**
 * Класс конфигурации Feign Client - декларативный HTTP клиент
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Configuration
public class FeignClientConfig {

    @Value("${url.request}")
    String url;

    /**
     * Возвращает сконфигурированный Feign Client, обращающийся к сайту service.nalog.ru
     * @return Feign
     */
    @Bean
    public NalogRepository getNalogRepository() {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new FormEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .target(NalogRepository.class, url);
    }

}
