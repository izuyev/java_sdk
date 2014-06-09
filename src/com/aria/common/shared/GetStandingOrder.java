package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "myStandingOrder",    "myClientOrderId"})
@XmlRootElement(name = "get_standing_order")
public class GetStandingOrder {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "my_standing_order")
    protected Long myStandingOrder;
        @XmlElement(name = "my_client_order_id")
    protected String myClientOrderId;
    
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
            public Long getMyStandingOrder() {
        return myStandingOrder;
    }

    public void setMyStandingOrder(Long value) {
        this.myStandingOrder = value;
    }
            public String getMyClientOrderId() {
        return myClientOrderId;
    }

    public void setMyClientOrderId(String value) {
        this.myClientOrderId = value;
    }
            
}
