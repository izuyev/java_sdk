package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","disputeOrWriteoffFlag","detailsFlag"})
@XmlRootElement(name = "get_acct_writeoff_or_disputes")
public class GetAcctWriteoffOrDisputes {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "dispute_or_writeoff_flag")
    protected Long disputeOrWriteoffFlag;
    @XmlElement(name = "details_flag")
    protected Long detailsFlag;
    
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
    
    public Long getDisputeOrWriteoffFlag() {
        return disputeOrWriteoffFlag;
    }

    public void setDisputeOrWriteoffFlag(Long value) {
        this.disputeOrWriteoffFlag = value;
    }
    
    public Long getDetailsFlag() {
        return detailsFlag;
    }

    public void setDetailsFlag(Long value) {
        this.detailsFlag = value;
    }
    
    
}
