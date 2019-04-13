package ru.stoloto.testwebapp.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class IndexController {

    @Autowired
    private NalogService nalogService;

    @PostMapping("/getInn")
    public ResponseEntity getInnForIndividual(@ApiParam("Модель данных пользователя для получения ИНН")
                                               @RequestBody InformationAboutIndividualDto informationDto){
        ResponseEntity responseEntity = nalogService.getInnForIndividual(informationDto);
        return responseEntity;
    }
}