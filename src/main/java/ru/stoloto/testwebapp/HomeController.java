package ru.stoloto.testwebapp;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping(path = "home", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class HomeController {

    @GetMapping("/")
    public String viewHome(@RequestParam(name = "id") UUID id){

        return "home";
    }
}
