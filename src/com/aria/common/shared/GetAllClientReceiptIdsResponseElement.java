package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "clientReceipt"})
@XmlRootElement(name = "get_all_client_receipt_idsResponseElement")
public class GetAllClientReceiptIdsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "client_receipt")
    protected List<ClientReceiptReturnElement> clientReceipt;
    
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

    public List<ClientReceiptReturnElement> getClientReceipt() {
        if (this.clientReceipt == null) {
            this.clientReceipt = new ArrayList<ClientReceiptReturnElement>();
        }
        return this.clientReceipt;
    }
}
