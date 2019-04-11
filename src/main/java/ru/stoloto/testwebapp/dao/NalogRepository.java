package ru.stoloto.testwebapp.dao;

import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

public interface NalogRepository {

    @RequestLine("POST /inn.do")
    AnswerFoNalogRu getInnForIndividual(@RequestBody InformationAboutIndividualDto informationDto);

}
