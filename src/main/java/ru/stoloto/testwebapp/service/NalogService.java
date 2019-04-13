package ru.stoloto.testwebapp.service;

import feign.FeignException;
import org.omg.CORBA.Any;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import ru.stoloto.testwebapp.repository.NalogRepository;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

@Service
public class NalogService {

    private NalogRepository nalogRepository;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public ResponseEntity getInnForIndividual(InformationAboutIndividualDto informationDto) {
        try {
//            RestTemplate restTemplater = new RestTemplate();
//            HttpHeaders header = new HttpHeaders();
//            header.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
//            HttpEntity<String> entity = new HttpEntity(informationDto, header);
//
//            ResponseEntity response = restTemplater.exchange("https://service.nalog.ru/inn-proc.do",
//                    HttpMethod.GET, entity, ResponseEntity.class);
//            return response;

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
