package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "myOrderNo",    "myClientOrderId",    "limitRecords",    "detailsFlag"})
@XmlRootElement(name = "get_order")
public class GetOrder {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "my_order_no")
    protected Long myOrderNo;
        @XmlElement(name = "my_client_order_id")
    protected String myClientOrderId;
        @XmlElement(name = "limit_records")
    protected Long limitRecords;
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
            public Long getMyOrderNo() {
        return myOrderNo;
    }

    public void setMyOrderNo(Long value) {
        this.myOrderNo = value;
    }
            public String getMyClientOrderId() {
        return myClientOrderId;
    }

    public void setMyClientOrderId(String value) {
        this.myClientOrderId = value;
    }
            public Long getLimitRecords() {
        return limitRecords;
    }

    public void setLimitRecords(Long value) {
        this.limitRecords = value;
    }
            public Long getDetailsFlag() {
        return detailsFlag;
    }

    public void setDetailsFlag(Long value) {
        this.detailsFlag = value;
    }
            
}
