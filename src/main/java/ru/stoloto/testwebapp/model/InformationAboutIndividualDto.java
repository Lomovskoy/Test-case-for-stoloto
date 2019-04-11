package ru.stoloto.testwebapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

@ApiModel("Модель данных пользователя для получения ИНН")
public class InformationAboutIndividualDto {

    @ApiModelProperty("Служебноеполе с типом запроса")
    private String c;

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
    private int doctype;

    @ApiModelProperty("Серия и номер документа")
    private String docno;

    @ApiModelProperty("Дата выдачи документа")
    private String docdt;

    public InformationAboutIndividualDto() {
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCaptchaToken() {
        return captchaToken;
    }

    public void setCaptchaToken(String captchaToken) {
        this.captchaToken = captchaToken;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getOtch() {
        return otch;
    }

    public void setOtch(String otch) {
        this.otch = otch;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getBplace() {
        return bplace;
    }

    public void setBplace(String bplace) {
        this.bplace = bplace;
    }

    public int getDoctype() {
        return doctype;
    }

    public void setDoctype(int doctype) {
        this.doctype = doctype;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public String getDocdt() {
        return docdt;
    }

    public void setDocdt(String docdt) {
        this.docdt = docdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InformationAboutIndividualDto)) return false;

        InformationAboutIndividualDto that = (InformationAboutIndividualDto) o;

        if (getDoctype() != that.getDoctype()) return false;
        if (!getC().equals(that.getC())) return false;
        if (!getCaptcha().equals(that.getCaptcha())) return false;
        if (!getCaptchaToken().equals(that.getCaptchaToken())) return false;
        if (!getFam().equals(that.getFam())) return false;
        if (!getNam().equals(that.getNam())) return false;
        if (!getOtch().equals(that.getOtch())) return false;
        if (!getBdate().equals(that.getBdate())) return false;
        if (!getBplace().equals(that.getBplace())) return false;
        if (!getDocno().equals(that.getDocno())) return false;
        return getDocdt().equals(that.getDocdt());
    }

    @Override
    public int hashCode() {
        int result = getC().hashCode();
        result = 31 * result + getCaptcha().hashCode();
        result = 31 * result + getCaptchaToken().hashCode();
        result = 31 * result + getFam().hashCode();
        result = 31 * result + getNam().hashCode();
        result = 31 * result + getOtch().hashCode();
        result = 31 * result + getBdate().hashCode();
        result = 31 * result + getBplace().hashCode();
        result = 31 * result + getDoctype();
        result = 31 * result + getDocno().hashCode();
        result = 31 * result + getDocdt().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "InformationAboutIndividualDto{" +
                "c='" + c + '\'' +
                ", captcha='" + captcha + '\'' +
                ", captchaToken='" + captchaToken + '\'' +
                ", fam='" + fam + '\'' +
                ", nam='" + nam + '\'' +
                ", otch='" + otch + '\'' +
                ", bdate='" + bdate + '\'' +
                ", bplace='" + bplace + '\'' +
                ", doctype=" + doctype +
                ", docno='" + docno + '\'' +
                ", docdt='" + docdt + '\'' +
                '}';
    }
}
