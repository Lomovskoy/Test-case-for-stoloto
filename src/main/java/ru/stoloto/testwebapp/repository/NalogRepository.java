package ru.stoloto.testwebapp.repository;

import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

public interface NalogRepository {

    @RequestLine("POST /inn-proc.do")
    AnswerFoNalogRu getInnForIndividual(@RequestBody InformationAboutIndividualDto informationDto);

}
