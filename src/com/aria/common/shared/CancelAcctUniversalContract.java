package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "updateComments",    "closeStatus"})
@XmlRootElement(name = "cancel_acct_universal_contract")
public class CancelAcctUniversalContract {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "update_comments")
    protected String updateComments;
        @XmlElement(name = "close_status")
    protected Long closeStatus;
    
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
            public String getUpdateComments() {
        return updateComments;
    }

    public void setUpdateComments(String value) {
        this.updateComments = value;
    }
            public Long getCloseStatus() {
        return closeStatus;
    }

    public void setCloseStatus(Long value) {
        this.closeStatus = value;
    }
            
}
