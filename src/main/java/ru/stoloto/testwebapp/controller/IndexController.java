package ru.stoloto.testwebapp.controller;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.NalogService;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;

@Controller
public class IndexController extends HttpServlet {

    @Autowired
    private NalogService nalogService;

    @PostMapping(value = "/inn")
    public String getInnForIndividual(@Validated InformationAboutIndividualDto informationDto, HttpServletRequest request){

        AnswerFoNalogRu answer = nalogService.getInnForIndividual(informationDto);
        request.setAttribute("inn", answer.getInn());
        return "info";
    }

    @GetMapping("/")
    public String viewForm(HttpServletRequest request){
        String token = nalogService.getToken();
        request.setAttribute("token", token);
        return "form";
    }

    @GetMapping("/capcha")
    public void getCapcha(@RequestParam String token, HttpServletResponse response) throws IOException {

        response.setContentType("application/octet-stream;charset=UTF-8");
        response.setHeader("Content-disposition", "filename=capcha.jpg");

        byte capcha[] = nalogService.getCaptcha(token);

        ServletOutputStream stream = response.getOutputStream();
        FileCopyUtils.copy(new ByteArrayInputStream(capcha), stream);

    }
}