package ru.stoloto.testwebapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;
import ru.stoloto.testwebapp.resitory.NalogRepository;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Сервис для работы с данными от сервера service.nalog.ru
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Service
public class NalogService {

    private final static Logger logger = Logger.getLogger(NalogService.class.getCanonicalName());

    private NalogRepository nalogRepository;

    @Autowired
    public void setNalogRepository(NalogRepository nalogRepository) {
        this.nalogRepository = nalogRepository;
    }

    /**
     * Метод обработки ответа от сайта service.nalog.ru
     * @param informationDto    - Объект сформированный из данных с формы фронта
     * @return AnswerFoNalogRu  - ответ от сервиса service.nalog.ru
     * @exception Exception     - любой ответ со статусом не 200, вызывающий ошибку.
     */
    public AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto) {
        try {
            AnswerFoNalogRu answer = nalogRepository.getInnForIndividual(convertDateFormat(informationDto));
            if(answer.getInn() == null) answer.setInn("Не найден");
            return answer;
        }catch (Exception ex){
            logger.log(Level.FINE, ex.getMessage());
            return new AnswerFoNalogRu("Внутренняя ошибка сервера", true, 0);
        }
    }

    /**
     * Метод для получения токена для капчи с сайта service.nalog.ru
     * @return String - токен для капчи, нужен для отпарвки запроса на капчи.
     */
    public String getToken() {
        return nalogRepository.getTokenCaptcha();
    }

    /**
     * Метод обработки даты в нужный формат для отправки на сайт service.nalog.ru
     * @param informationDto                    - Модель данных пользователя для получения ИНН
     * @return InformationAboutIndividualDto    - обработанная модель данных для получения ИНН
     */
    private InformationAboutIndividualDto convertDateFormat(InformationAboutIndividualDto informationDto) {
        String[] bdate = informationDto.getBdate().split("-");
        informationDto.setBdate(bdate[2] + "." + bdate[1] + "." + bdate[0]);
        return informationDto;
    }
}
