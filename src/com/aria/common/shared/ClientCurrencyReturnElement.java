package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_currency_ReturnElement", propOrder = {"currencyCd", "currencyName", "currencyShortName", "iso4217n", "currencySymbol", "currencyHtml", "defaultInd"})
public class ClientCurrencyReturnElement {

    @XmlElement(name = "currency_cd")
    protected String currencyCd;
    @XmlElement(name = "currency_name")
    protected String currencyName;
    @XmlElement(name = "currency_short_name")
    protected String currencyShortName;
    @XmlElement(name = "iso_4217n")
    protected Long iso4217n;
    @XmlElement(name = "currency_symbol")
    protected String currencySymbol;
    @XmlElement(name = "currency_html")
    protected String currencyHtml;
    @XmlElement(name = "default_ind")
    protected Long defaultInd;
    
    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String value) {
        this.currencyName = value;
    }

    public String getCurrencyShortName() {
        return currencyShortName;
    }

    public void setCurrencyShortName(String value) {
        this.currencyShortName = value;
    }

    public Long getIso4217n() {
        return iso4217n;
    }

    public void setIso4217n(Long value) {
        this.iso4217n = value;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String value) {
        this.currencySymbol = value;
    }

    public String getCurrencyHtml() {
        return currencyHtml;
    }

    public void setCurrencyHtml(String value) {
        this.currencyHtml = value;
    }

    public Long getDefaultInd() {
        return defaultInd;
    }

    public void setDefaultInd(Long value) {
        this.defaultInd = value;
    }

    
}
