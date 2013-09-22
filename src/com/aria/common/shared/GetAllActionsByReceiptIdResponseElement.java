package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "receiptAction"})
@XmlRootElement(name = "get_all_actions_by_receipt_idResponseElement")
public class GetAllActionsByReceiptIdResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "receipt_action")
    protected List<ReceiptActionReturnElement> receiptAction;
    
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

    public List<ReceiptActionReturnElement> getReceiptAction() {
        if (this.receiptAction == null) {
            this.receiptAction = new ArrayList<ReceiptActionReturnElement>();
        }
        return this.receiptAction;
    }
}
