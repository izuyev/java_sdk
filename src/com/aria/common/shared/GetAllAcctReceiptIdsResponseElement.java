package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctReceipt"})
@XmlRootElement(name = "get_all_acct_receipt_idsResponseElement")
public class GetAllAcctReceiptIdsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_receipt")
    protected List<AcctReceiptReturnElement> acctReceipt;
    
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

    public List<AcctReceiptReturnElement> getAcctReceipt() {
        if (this.acctReceipt == null) {
            this.acctReceipt = new ArrayList<AcctReceiptReturnElement>();
        }
        return this.acctReceipt;
    }
}
