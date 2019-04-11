package ru.stoloto.testwebapp.controller;

import io.swagger.annotations.ApiParam;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class IndexController {

    @PostMapping("/home")
    public InformationAboutIndividualDto viewHome(
            @ApiParam("Модель данных пользователя для получения ИНН")
            @RequestBody InformationAboutIndividualDto informationDto
    ){
        return informationDto;
    }
}