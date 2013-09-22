package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","accountNo","userid","daysToRestore","dateToRestore","reasonCd","comments"})
@XmlRootElement(name = "ban_acct")
public class BanAcct {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "account_no")
    protected Long accountNo;
    @XmlElement(name = "userid")
    protected String userid;
    @XmlElement(name = "days_to_restore")
    protected Long daysToRestore;
    @XmlElement(name = "date_to_restore")
    protected String dateToRestore;
    @XmlElement(name = "reason_cd")
    protected Long reasonCd;
    @XmlElement(name = "comments")
    protected String comments;
    
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
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String value) {
        this.userid = value;
    }
    
    public Long getDaysToRestore() {
        return daysToRestore;
    }

    public void setDaysToRestore(Long value) {
        this.daysToRestore = value;
    }
    
    public String getDateToRestore() {
        return dateToRestore;
    }

    public void setDateToRestore(String value) {
        this.dateToRestore = value;
    }
    
    public Long getReasonCd() {
        return reasonCd;
    }

    public void setReasonCd(Long value) {
        this.reasonCd = value;
    }
    
    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }
    
    
}
