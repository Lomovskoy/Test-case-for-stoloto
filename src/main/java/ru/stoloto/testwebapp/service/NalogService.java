package ru.stoloto.testwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;

import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;

/**
 * Сервис для работы с данными от сервера service.nalog.ru
 *
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Service
public class NalogService {

    private NalogRepository nalogRepository;

    private int time = 500000;

    private int version = 3;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) {
        try {
            AnswerFoNalogRu answer = nalogRepository.getInnForIndividual(convertDateFormat(informationDto));
            if(answer.getInn() == null) answer.setInn("Не найден");
            return answer;
        }catch (Exception ex){
            return new AnswerFoNalogRu("Внутренняя ошибка сервера", true, 1);
        }

    }

    public String getToken() {
        return nalogRepository.getTokenCaptcha();
    }

    public byte[] getCaptcha(String token) {
        LinkedHashMap resp = nalogRepository.getCaptcha(time, token, version);
        String body = resp.toString();
        return new byte[]{(byte)0xe0};
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
