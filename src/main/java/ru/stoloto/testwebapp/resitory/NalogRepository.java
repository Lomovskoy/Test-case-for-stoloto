package ru.stoloto.testwebapp.resitory;

import feign.Headers;
import feign.RequestLine;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

@RequestMapping
public interface NalogRepository {

    @RequestLine("POST /inn-proc.do")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto);
}
