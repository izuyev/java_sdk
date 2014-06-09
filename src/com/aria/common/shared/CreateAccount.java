package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "planNo",    "statusCd",    "userid",    "password",    "promoCd",    "altRateScheduleNo",    "clientReceiptId",    "currencyCd"})
@XmlRootElement(name = "create_account")
public class CreateAccount {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "plan_no")
    protected Long planNo;
        @XmlElement(name = "status_cd")
    protected Long statusCd;
        @XmlElement(name = "userid")
    protected String userid;
        @XmlElement(name = "password")
    protected String password;
        @XmlElement(name = "promo_cd")
    protected String promoCd;
        @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
        @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
        @XmlElement(name = "currency_cd")
    protected String currencyCd;
    
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

    public Long getPlanNo() {
        return planNo;
    }

    public void setPlanNo(Long value) {
        this.planNo = value;
    }
            public Long getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(Long value) {
        this.statusCd = value;
    }
            public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }
            public String getPassword() {
        return password;
    }

    public void setPassword(String value) {
        this.password = value;
    }
            public String getPromoCd() {
        return promoCd;
    }

    public void setPromoCd(String value) {
        this.promoCd = value;
    }
            public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }
            public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
            public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String value) {
        this.currencyCd = value;
    }
            
}
