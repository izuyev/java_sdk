package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "orderedInd", "billedInd", "paidInd"})
@XmlRootElement(name = "get_acct_has_ordered_skuResponseElement")
public class GetAcctHasOrderedSkuResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "ordered_ind")
    protected Long orderedInd;
    @XmlElement(name = "billed_ind")
    protected Long billedInd;
    @XmlElement(name = "paid_ind")
    protected Long paidInd;
    
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

    public Long getOrderedInd() {
        return orderedInd;
    }

    public void setOrderedInd(Long value) {
        this.orderedInd = value;
    }

    public Long getBilledInd() {
        return billedInd;
    }

    public void setBilledInd(Long value) {
        this.billedInd = value;
    }

    public Long getPaidInd() {
        return paidInd;
    }

    public void setPaidInd(Long value) {
        this.paidInd = value;
    }

    
}
