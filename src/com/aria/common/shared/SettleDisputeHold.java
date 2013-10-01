package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey","acctNo","disputeNo","settlementAction"})
@XmlRootElement(name = "settle_dispute_hold")
public class SettleDisputeHold {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
    @XmlElement(name = "acct_no")
    protected Long acctNo;
    @XmlElement(name = "dispute_no")
    protected Long disputeNo;
    @XmlElement(name = "settlement_action")
    protected Long settlementAction;
    
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
    
    public Long getDisputeNo() {
        return disputeNo;
    }

    public void setDisputeNo(Long value) {
        this.disputeNo = value;
    }
    
    public Long getSettlementAction() {
        return settlementAction;
    }

    public void setSettlementAction(Long value) {
        this.settlementAction = value;
    }
    
    
}
