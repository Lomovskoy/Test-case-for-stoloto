package ru.stoloto.testwebapp.resitory;

import feign.Headers;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.stoloto.testwebapp.model.AnswerFoNalogRu;
import ru.stoloto.testwebapp.model.InformationAboutIndividualDto;

/**
 * Репозиторий для получения данных от сервера service.nalog.ru
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@RequestMapping
public interface NalogRepository {

    /**
     * Метод получения ИНН от сайта service.nalog.ru
     * @param informationDto    - Объект сформированный из данных с формы фронта
     * @return AnswerFoNalogRu  - ответ от сервиса service.nalog.ru
     */
    @RequestLine("POST /inn-proc.do")
    @Headers("Content-Type: application/x-www-form-urlencoded")
    AnswerFoNalogRu getInnForIndividual(InformationAboutIndividualDto informationDto);

    /**
     * Метод для получения токена для капчи с сайта service.nalog.ru
     * @return String - токен для капчи, нужен для отпарвки запроса на капчи.
     */
    @RequestLine("GET /static/captcha.bin")
    @Headers("Content-Type: test/plan")
    String getTokenCaptcha();

}
