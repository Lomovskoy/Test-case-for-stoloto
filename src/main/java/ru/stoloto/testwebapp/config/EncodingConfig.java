package ru.stoloto.testwebapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class EncodingConfig {

    @Bean
    public CharacterEncodingFilter getCharacterEncodingFilter() {
        return new CharacterEncodingFilter("UTF-8", true, true);
    }
}
