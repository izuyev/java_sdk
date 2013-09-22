package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","planNo","serviceNo","customAcctRates"})
@XmlRootElement(name = "assign_custom_acct_rates")
public class AssignCustomAcctRates {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "plan_no")
    protected Long planNo;
    @XmlElement(name = "service_no")
    protected Long serviceNo;
    @XmlElement(name = "custom_acct_rates")
    protected CustomAcctRatesArray customAcctRates;
    
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

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
    
    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }
    
    public Long getServiceNo() {
        return serviceNo;
    }

    public void setServiceNo(Long value) {
        this.serviceNo = value;
    }
    
    public CustomAcctRatesArray getCustomAcctRates() {
        return customAcctRates;
    }

    public void setCustomAcctRates(CustomAcctRatesArray value) {
        this.customAcctRates = value;
    }
    
    
}
