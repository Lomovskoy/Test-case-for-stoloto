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
    private String doctype;

    @ApiModelProperty("Серия и номер документа")
    private String docno;

    @ApiModelProperty("Дата выдачи документа")
    private String docdt;

    public InformationAboutIndividualDto() {
    }

    public InformationAboutIndividualDto(String c, String captcha, String captchaToken, String fam, String nam, String otch,
                                         String bdate, String bplace, String doctype, String docno, String docdt) {
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

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
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

        if (getC() != null ? !getC().equals(that.getC()) : that.getC() != null) return false;
        if (getCaptcha() != null ? !getCaptcha().equals(that.getCaptcha()) : that.getCaptcha() != null) return false;
        if (getCaptchaToken() != null ? !getCaptchaToken().equals(that.getCaptchaToken()) : that.getCaptchaToken() != null)
            return false;
        if (getFam() != null ? !getFam().equals(that.getFam()) : that.getFam() != null) return false;
        if (getNam() != null ? !getNam().equals(that.getNam()) : that.getNam() != null) return false;
        if (getOtch() != null ? !getOtch().equals(that.getOtch()) : that.getOtch() != null) return false;
        if (getBdate() != null ? !getBdate().equals(that.getBdate()) : that.getBdate() != null) return false;
        if (getBplace() != null ? !getBplace().equals(that.getBplace()) : that.getBplace() != null) return false;
        if (getDoctype() != null ? !getDoctype().equals(that.getDoctype()) : that.getDoctype() != null) return false;
        if (getDocno() != null ? !getDocno().equals(that.getDocno()) : that.getDocno() != null) return false;
        return getDocdt() != null ? getDocdt().equals(that.getDocdt()) : that.getDocdt() == null;
    }

    @Override
    public int hashCode() {
        int result = getC() != null ? getC().hashCode() : 0;
        result = 31 * result + (getCaptcha() != null ? getCaptcha().hashCode() : 0);
        result = 31 * result + (getCaptchaToken() != null ? getCaptchaToken().hashCode() : 0);
        result = 31 * result + (getFam() != null ? getFam().hashCode() : 0);
        result = 31 * result + (getNam() != null ? getNam().hashCode() : 0);
        result = 31 * result + (getOtch() != null ? getOtch().hashCode() : 0);
        result = 31 * result + (getBdate() != null ? getBdate().hashCode() : 0);
        result = 31 * result + (getBplace() != null ? getBplace().hashCode() : 0);
        result = 31 * result + (getDoctype() != null ? getDoctype().hashCode() : 0);
        result = 31 * result + (getDocno() != null ? getDocno().hashCode() : 0);
        result = 31 * result + (getDocdt() != null ? getDocdt().hashCode() : 0);
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
                ", doctype='" + doctype + '\'' +
                ", docno='" + docno + '\'' +
                ", docdt='" + docdt + '\'' +
                '}';
    }
}
