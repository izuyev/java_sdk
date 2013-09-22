package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"transactionId", "balanceTransferred", "errorCode", "errorMsg"})
@XmlRootElement(name = "transfer_account_balanceResponseElement")
public class TransferAccountBalanceResponseElement {

    @XmlElement(name = "transaction_id")
    protected Long transactionId;
    @XmlElement(name = "balance_transferred")
    protected Double balanceTransferred;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long value) {
        this.transactionId = value;
    }

    public Double getBalanceTransferred() {
        return balanceTransferred;
    }

    public void setBalanceTransferred(Double value) {
        this.balanceTransferred = value;
    }

    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
