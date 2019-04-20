package ru.stoloto.testwebapp.model;

import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Модель данных получаемая от сервера service.nalog.ru
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
public class AnswerFoNalogRu {

    /** ИНН физического лица */
    private String inn;

    /** Обязательность капчи */
    private Boolean captchaRequired;

    /** Код ответа 1 есть ИНН 0 нет ИНН */
    private int code;

    public AnswerFoNalogRu(String inn, Boolean captchaRequired, int code) {
        this.inn = inn;
        this.captchaRequired = captchaRequired;
        this.code = code;
    }
}
