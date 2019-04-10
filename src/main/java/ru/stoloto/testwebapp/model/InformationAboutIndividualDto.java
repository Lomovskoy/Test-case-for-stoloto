package ru.stoloto.testwebapp.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDate;
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
    private LocalDate bdate;

    @ApiModelProperty("Место рождения")
    private String bplace;

    @ApiModelProperty("Тип документа код")
    private int doctype;

    @ApiModelProperty("Серия и номер документа")
    private String docno;

    @ApiModelProperty("Дата выдачи документа")
    private LocalDate docdt;

    public InformationAboutIndividualDto() {
    }

    public InformationAboutIndividualDto(String c, String captcha, String captchaToken, String fam, String nam, String otch,
                                         LocalDate bdate, String bplace, int doctype, String docno, LocalDate docdt) {
        this.c = c;
        this.captcha = captcha;
        this.captchaToken = captchaToken;
        this.fam = fam;
        this.nam = nam;
        this.otch = otch;
        this.bdate = bdate;
        this.bplace = bplace;
        this.doctype = doctype;
        this.docno = docno;
        this.docdt = docdt;
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

    public LocalDate getBdate() {
        return bdate;
    }

    public void setBdate(LocalDate bdate) {
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

    public LocalDate getDocdt() {
        return docdt;
    }

    public void setDocdt(LocalDate docdt) {
        this.docdt = docdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof InformationAboutIndividualDto)) return false;
        InformationAboutIndividualDto that = (InformationAboutIndividualDto) o;
        return getDoctype() == that.getDoctype() &&
                Objects.equals(getC(), that.getC()) &&
                Objects.equals(getCaptcha(), that.getCaptcha()) &&
                Objects.equals(getCaptchaToken(), that.getCaptchaToken()) &&
                Objects.equals(getFam(), that.getFam()) &&
                Objects.equals(getNam(), that.getNam()) &&
                Objects.equals(getOtch(), that.getOtch()) &&
                Objects.equals(getBdate(), that.getBdate()) &&
                Objects.equals(getBplace(), that.getBplace()) &&
                Objects.equals(getDocno(), that.getDocno()) &&
                Objects.equals(getDocdt(), that.getDocdt());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getC(), getCaptcha(), getCaptchaToken(), getFam(), getNam(), getOtch(), getBdate(), getBplace(), getDoctype(), getDocno(), getDocdt());
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
                ", bdate=" + bdate +
                ", bplace='" + bplace + '\'' +
                ", doctype=" + doctype +
                ", docno='" + docno + '\'' +
                ", docdt=" + docdt +
                '}';
    }
}
