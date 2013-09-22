package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_country_ReturnElement", propOrder = {"countryCd", "countryNative", "countryEnglish", "iso31661n", "currencyCd"})
public class ClientCountryReturnElement {

    @XmlElement(name = "country_cd")
    protected String countryCd;
    @XmlElement(name = "country_native")
    protected String countryNative;
    @XmlElement(name = "country_english")
    protected String countryEnglish;
    @XmlElement(name = "iso_3166_1n")
    protected String iso31661n;
    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    
    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String value) {
        this.countryCd = value;
    }

    public String getCountryNative() {
        return countryNative;
    }

    public void setCountryNative(String value) {
        this.countryNative = value;
    }

    public String getCountryEnglish() {
        return countryEnglish;
    }

    public void setCountryEnglish(String value) {
        this.countryEnglish = value;
    }

    public String getIso31661n() {
        return iso31661n;
    }

    public void setIso31661n(String value) {
        this.iso31661n = value;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    
}
