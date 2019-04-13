package ru.stoloto.testwebapp.repository;

import feign.Headers;
import feign.RequestLine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

public interface NalogRepository {

    @RequestLine("POST /inn-proc.do")
    //@Headers(name = "Content-Type", value = "application/x-www-form-urlencoded")
    ResponseEntity getInnForIndividual(
            @RequestHeader(name = "Content-Type", value = "application/x-www-form-urlencoded")
            @RequestBody InformationAboutIndividualDto informationDto);

}
