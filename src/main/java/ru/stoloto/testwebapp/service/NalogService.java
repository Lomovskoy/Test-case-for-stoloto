package ru.stoloto.testwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;
import java.time.format.DateTimeFormatter;

/**
 * Сервис для работы с данными от сервера service.nalog.ru
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Service
public class NalogService {

    private NalogRepository nalogRepository;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) {

        return nalogRepository.getInnForIndividual(convertDateFormat(informationDto));

    }

    private InformationAboutIndividualDto convertDateFormat(InformationAboutIndividualDto informationDto) {

        String[] bdate = informationDto.getBdate().split("-");
        informationDto.setBdate(bdate[2] + "." +  bdate[1] + "." + bdate[0]);

        if (informationDto.getDocdt() != null && !informationDto.getDocdt().equals("")){
            String[] docdt = informationDto.getDocdt().split("-");
            informationDto.setDocdt(docdt[2] + "." +  docdt[1] + "." + docdt[0]);
        }
        return informationDto;
    }
}
