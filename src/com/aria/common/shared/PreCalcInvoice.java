package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","logId","firstName","mi","lastName","address1","address2","city","stateProvCode","zipCode","countryCode","currencyCode","preCalcPlan","preCalcSku","taxExemptCd","address3"})
@XmlRootElement(name = "pre_calc_invoice")
public class PreCalcInvoice {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "log_id")
    protected String logId;
    @XmlElement(name = "first_name")
    protected String firstName;
    @XmlElement(name = "mi")
    protected String mi;
    @XmlElement(name = "last_name")
    protected String lastName;
    @XmlElement(name = "address1")
    protected String address1;
    @XmlElement(name = "address2")
    protected String address2;
    @XmlElement(name = "city")
    protected String city;
    @XmlElement(name = "state_prov_code")
    protected String stateProvCode;
    @XmlElement(name = "zip_code")
    protected String zipCode;
    @XmlElement(name = "country_code")
    protected String countryCode;
    @XmlElement(name = "currency_code")
    protected String currencyCode;
    @XmlElement(name = "pre_calc_plan")
    protected PreCalcPlanArray preCalcPlan;
    @XmlElement(name = "pre_calc_sku")
    protected PreCalcSkuArray preCalcSku;
    @XmlElement(name = "tax_exempt_cd")
    protected Long taxExemptCd;
    @XmlElement(name = "address3")
    protected String address3;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public String getLogId() {
        return logId;
    }

    public void setLogId(String value) {
        this.logId = value;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }
    
    public String getMi() {
        return mi;
    }

    public void setMi(String value) {
        this.mi = value;
    }
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }
    
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String value) {
        this.address1 = value;
    }
    
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String value) {
        this.address2 = value;
    }
    
    public String getCity() {
        return city;
    }

    public void setCity(String value) {
        this.city = value;
    }
    
    public String getStateProvCode() {
        return stateProvCode;
    }

    public void setStateProvCode(String value) {
        this.stateProvCode = value;
    }
    
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String value) {
        this.zipCode = value;
    }
    
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String value) {
        this.countryCode = value;
    }
    
    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }
    
    public PreCalcPlanArray getPreCalcPlan() {
        return preCalcPlan;
    }

    public void setPreCalcPlan(PreCalcPlanArray value) {
        this.preCalcPlan = value;
    }
    
    public PreCalcSkuArray getPreCalcSku() {
        return preCalcSku;
    }

    public void setPreCalcSku(PreCalcSkuArray value) {
        this.preCalcSku = value;
    }
    
    public Long getTaxExemptCd() {
        return taxExemptCd;
    }

    public void setTaxExemptCd(Long value) {
        this.taxExemptCd = value;
    }
    
    public String getAddress3() {
        return address3;
    }

    public void setAddress3(String value) {
        this.address3 = value;
    }
    
    
}
