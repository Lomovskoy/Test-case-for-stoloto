package ru.stoloto.testwebapp.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

//@Controller
//@Api(tags = "Контроллер для договоров")
//public class IndexController {
//
//    @ApiOperation("Получение договора по id")
//    @RequestMapping(value="/home", method = RequestMethod.GET)
//    public String viewHome(){
//        return "home";
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
@RestController
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class IndexController {

    @GetMapping("/home")
    public InformationAboutIndividualDto viewHome(){
        return new InformationAboutIndividualDto();
    }
}