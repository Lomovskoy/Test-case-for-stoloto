package ru.stoloto.testwebapp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;

@Controller
@Api(tags = "Главный контроллер приложения")
public class IndexController {

    @Autowired
    private NalogService nalogService;

    @PostMapping(value = "/inn",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ApiOperation("Метод получения ИНН по пользовательяским данным")
    @ResponseBody
    public AnswerFoNalogRu getInnForIndividual(@ApiParam("Модель данных пользователя для получения ИНН")
                                               @RequestBody InformationAboutIndividualDto informationDto) {
        AnswerFoNalogRu answer  = nalogService.getInnForIndividual(informationDto);
        return answer;
    }

    @GetMapping
    public String viewForm(){
        return "form";
    }
}