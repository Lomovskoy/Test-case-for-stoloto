package ru.stoloto.testwebapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@ApiModel("Модель данных пользователя для получения ИНН")
@Data
@NoArgsConstructor
public class InformationAboutIndividualDto {

    @ApiModelProperty("Служебноеполе с типом запроса")
    private String c = "innMy";

    @ApiModelProperty("Капча")
    private String captcha;

    @ApiModelProperty("Токен капчи")
    private String captchaToken;

    @ApiModelProperty("Фамилия")
    private String fam;

    @ApiModelProperty("Имя")
    private String nam;

    @ApiModelProperty("Отчество")
    private String otch;

    @ApiModelProperty("Дата рождения")
    private String bdate;

    @ApiModelProperty("Место рождения")
    private String bplace;

    @ApiModelProperty("Тип документа")
    private int doctype = 21;

    @ApiModelProperty("Серия и номер документа")
    private String docno;

    @ApiModelProperty("Дата выдачи документа")
    private String docdt;
}
