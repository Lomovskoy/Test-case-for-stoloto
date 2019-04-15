package ru.stoloto.testwebapp.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Map;

@Component
public class UtilsService {

    private ObjectMapper objectMapper = new ObjectMapper();

    public Map<?, ?> toMap(Object obj){

        return objectMapper.convertValue(obj, Map.class);
    }
}
