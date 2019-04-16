package ru.stoloto.testwebapp.service;

import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;

@Service
public class NalogService {

    private NalogRepository nalogRepository;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public ResponseEntity getInnForIndividual(InformationAboutIndividualDto informationDto) {
        try {
            return nalogRepository.getInnForIndividual(informationDto);
        }catch (FeignException ex){
            System.out.println(ex.contentUTF8());
            return new ResponseEntity(ex.contentUTF8(), HttpStatus.BAD_REQUEST);
        }catch (HttpClientErrorException exp){
            System.out.println(exp.getResponseBodyAsString());
            return new ResponseEntity(exp.getResponseBodyAsString(), HttpStatus.BAD_REQUEST);
        }
    }
}
