package ru.stoloto.testwebapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Модель данных пользователя для получения ИНН
 * @author lomovskoy_ky
 * @version 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class InformationAboutIndividualDto {

    /** Служебноеполе с типом запроса */
    private String c = "innMy";

    /** Капча */
    private String captcha;

    /** Токен капчи */
    private String captchaToken;

    /** Фамилия */
    private String fam;

    /** Имя */
    private String nam;

    /** Отчество */
    private String otch;

    /** Дата рождения */
    private String bdate;

    /** Место рождения */
    private String bplace;

    /** Тип документа */
    private int doctype = 21;

    /** Серия и номер документа */
    private String docno;

    /** Дата выдачи документа */
    private String docdt;
}
