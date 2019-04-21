package ru.stoloto.testwebapp.service;

import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

public interface NalogService {

    /**
     * Метод обработки ответа от сайта service.nalog.ru
     * @param informationDto    - Объект сформированный из данных с формы фронта
     * @return AnswerFoNalogRu  - ответ от сервиса service.nalog.ru
     */
    AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto);

    /**
     * Метод для получения токена для капчи с сайта service.nalog.ru
     * @return String - токен для капчи, нужен для отпарвки запроса на капчи.
     */
    String getToken();
}
