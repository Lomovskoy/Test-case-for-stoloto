package ru.stoloto.testwebapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.service.impl.NalogServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Главный контроллер прилдожения
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Controller
public class IndexController extends HttpServlet {

    @Autowired
    private NalogServiceImpl nalogServiceImpl;

    /**
     * Метод полечения ИНН по информации из формы на фронте
     * @param informationDto    - модель данных пользователя для получения ИНН
     * @param request           - обьект дающий возможность сервлету обрабатывать клиентский запрос.
     * @return                  - возвращает страницу из контекста приложения /WEB-INF/jsp/info.jsp
     */
    @PostMapping(value = "/inn")
    public String getInnForIndividual(@Validated InformationAboutIndividualDto informationDto, HttpServletRequest request){
        request.setAttribute("inn", nalogServiceImpl.getInnForIndividual(informationDto).getInn());
        return "info";
    }

    /**
     * Метод возвращающий главную страницу прилодения для воода данных.
     * @param request   - обьект дающий возможность сервлету обрабатывать клиентский запрос.
     * @return          - возвращает страницу из контекста приложения /WEB-INF/jsp/form.jsp
     */
    @GetMapping("/")
    public String viewForm(HttpServletRequest request){
        request.setAttribute("token", nalogServiceImpl.getToken());
        return "form";
    }

}