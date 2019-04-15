package ru.stoloto.testwebapp.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;

import java.io.IOException;

@RestController
@RequestMapping(path = "/inn", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class IndexController {

    @Autowired
    private NalogService nalogService;

    @PostMapping
    public AnswerFoNalogRu getInnForIndividual(@ApiParam("Модель данных пользователя для получения ИНН")
                                               @RequestBody InformationAboutIndividualDto informationDto) throws IOException {
        AnswerFoNalogRu answer  = nalogService.getInnForIndividual(informationDto);
        return answer;
    }

    @GetMapping
    public String viewForm(){
        return "index";
    }
}