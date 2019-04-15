package ru.stoloto.testwebapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@ApiModel("Модель данных получаемая от сервера service.nalog.ru")
@Data
@NoArgsConstructor
public class AnswerFoNalogRu {

    @ApiModelProperty("ИНН физического лица")
    private String inn;

    @ApiModelProperty("Обязательность капчи")
    private Boolean captchaRequired;

    @ApiModelProperty("Код ответа 1 есть ИНН 0 нет ИНН")
    private int code;
}
