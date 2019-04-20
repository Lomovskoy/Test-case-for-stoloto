package ru.stoloto.testwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;

/**
 * Сервис для работы с данными от сервера service.nalog.ru
 *
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Service
public class NalogService {

    private NalogRepository nalogRepository;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) {
        try {
            String token = nalogRepository.getTokenCaptcha();
            AnswerFoNalogRu answer = nalogRepository.getInnForIndividual(convertDateFormat(informationDto));
            if(answer.getInn() == null) answer.setInn("Не найден");
            return answer;
        }catch (Exception ex){
            return new AnswerFoNalogRu("Внутренняя ошибка сервера", true, 1);
        }

    }

    private InformationAboutIndividualDto convertDateFormat(InformationAboutIndividualDto informationDto) {

        String[] bdate = informationDto.getBdate().split("-");
        informationDto.setBdate(bdate[2] + "." + bdate[1] + "." + bdate[0]);

        if (informationDto.getDocdt() != null && !informationDto.getDocdt().equals("")) {
            String[] docdt = informationDto.getDocdt().split("-");
            informationDto.setDocdt(docdt[2] + "." + docdt[1] + "." + docdt[0]);
        }
        return informationDto;
    }
}
