package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","accountNo","respLevelCd","seniorAccountNo","seniorAcctUserId","clientSeniorAcctId"})
@XmlRootElement(name = "set_payment_responsibility")
public class SetPaymentResponsibility {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "account_no")
    protected Long accountNo;
    @XmlElement(name = "resp_level_cd")
    protected Long respLevelCd;
    @XmlElement(name = "senior_account_no")
    protected Long seniorAccountNo;
    @XmlElement(name = "senior_acct_user_id")
    protected String seniorAcctUserId;
    @XmlElement(name = "client_senior_acct_id")
    protected String clientSeniorAcctId;
    
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

    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long value) {
        this.accountNo = value;
    }
    
    public Long getRespLevelCd() {
        return respLevelCd;
    }

    public void setRespLevelCd(Long value) {
        this.respLevelCd = value;
    }
    
    public Long getSeniorAccountNo() {
        return seniorAccountNo;
    }

    public void setSeniorAccountNo(Long value) {
        this.seniorAccountNo = value;
    }
    
    public String getSeniorAcctUserId() {
        return seniorAcctUserId;
    }

    public void setSeniorAcctUserId(String value) {
        this.seniorAcctUserId = value;
    }
    
    public String getClientSeniorAcctId() {
        return clientSeniorAcctId;
    }

    public void setClientSeniorAcctId(String value) {
        this.clientSeniorAcctId = value;
    }
    
    
}
