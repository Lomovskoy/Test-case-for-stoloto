package ru.stoloto.testwebapp.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.annotations.ApiIgnore;

@Controller
@CrossOrigin
@ApiIgnore
@RequestMapping(path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ApiInfoController {

    @RequestMapping(value="/v1", method = RequestMethod.GET)
    public String getInfo(){
        return "redirect:/swagger-ui.html";
    }
}
