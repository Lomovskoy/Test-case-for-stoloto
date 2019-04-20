package ru.stoloto.testwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController extends HttpServlet {

    @Autowired
    private NalogService nalogService;

    @PostMapping(value = "/inn")
    public String getInnForIndividual(@Validated InformationAboutIndividualDto informationDto, HttpServletRequest request){
        request.setAttribute("inn", nalogService.getInnForIndividual(informationDto).getInn());
        return "info";
    }

    @GetMapping("/")
    public String viewForm(HttpServletRequest request){
        request.setAttribute("token", nalogService.getToken());
        return "form";
    }

}