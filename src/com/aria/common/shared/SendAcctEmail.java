package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","userId","templateClass","templateNo","clientReceiptId"})
@XmlRootElement(name = "send_acct_email")
public class SendAcctEmail {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "user_id")
    protected String userId;
    @XmlElement(name = "template_class")
    protected String templateClass;
    @XmlElement(name = "template_no")
    protected Long templateNo;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String value) {
        this.userId = value;
    }
    
    public String getTemplateClass() {
        return templateClass;
    }

    public void setTemplateClass(String value) {
        this.templateClass = value;
    }
    
    public Long getTemplateNo() {
        return templateNo;
    }

    public void setTemplateNo(Long value) {
        this.templateNo = value;
    }
    
    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }
    
    
}
