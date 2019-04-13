package ru.stoloto.testwebapp.config;

import feign.Feign;
import feign.Logger;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.stoloto.testwebapp.repository.NalogRepository;

@Configuration
public class FeignClientConfig {

    @Bean
    public NalogRepository getNalogRepository() {

        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .logger(new Slf4jLogger())
                .logLevel(Logger.Level.FULL)
                .target(NalogRepository.class, "https://service.nalog.ru");
    }

}
