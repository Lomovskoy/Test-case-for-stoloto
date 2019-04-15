package ru.stoloto.testwebapp.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;

import java.io.IOException;

@RestController
public class IndexController {

    @Autowired
    private NalogService nalogService;

    @PostMapping(path = "/home",  produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public AnswerFoNalogRu getInnForIndividual(@ApiParam("Модель данных пользователя для получения ИНН")
                                               @RequestBody InformationAboutIndividualDto informationDto) throws IOException {
        AnswerFoNalogRu answer  = nalogService.getInnForIndividual(informationDto);
        return answer;
    }
}