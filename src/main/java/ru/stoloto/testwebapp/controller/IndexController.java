package ru.stoloto.testwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class IndexController extends HttpServlet {

    @Autowired
    private NalogService nalogService;

    @PostMapping(value = "/inn")
    public String getInnForIndividual(@Validated InformationAboutIndividualDto informationDto, HttpServletRequest request){

        AnswerFoNalogRu answer = nalogService.getInnForIndividual(informationDto);
        request.getSession(false).setAttribute("inn", answer.getInn());
        return "info";
    }

    @GetMapping("/")
    public String viewForm(){
        return "form";
    }




}