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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Service
public class NalogService {

    private NalogRepository nalogRepository;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) {

//        try {
            String[] bdate = informationDto.getBdate().split("-");
            informationDto.setBdate(bdate[2] + "." +  bdate[1] + "." + bdate[0]);
            if (informationDto.getDocdt() != null && !informationDto.getDocdt().equals("")){
                String[] docdt = informationDto.getDocdt().split("-");
                informationDto.setDocdt(docdt[2] + "." +  docdt[1] + "." + docdt[0]);
            }
            return nalogRepository.getInnForIndividual(informationDto);
//        } catch (FeignException ex) {
//            System.out.println(ex.contentUTF8());
//            return new ResponseEntity(ex.contentUTF8(), HttpStatus.BAD_REQUEST);
//        } catch (HttpClientErrorException exp) {
//            System.out.println(exp.getResponseBodyAsString());
//            return new ResponseEntity(exp.getResponseBodyAsString(), HttpStatus.BAD_REQUEST);
//        }catch (NullPointerException expnull){
//            System.out.println(expnull.getMessage());
//            return new ResponseEntity(expnull.getMessage(), HttpStatus.BAD_REQUEST);
//        }
    }
}
