package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "reversibleInvoices"})
@XmlRootElement(name = "get_reversible_invs_by_paymentResponseElement")
public class GetReversibleInvsByPaymentResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "reversible_invoices")
    protected List<ReversibleInvoicesReturnElement> reversibleInvoices;
    
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

    public List<ReversibleInvoicesReturnElement> getReversibleInvoices() {
        if (this.reversibleInvoices == null) {
            this.reversibleInvoices = new ArrayList<ReversibleInvoicesReturnElement>();
        }
        return this.reversibleInvoices;
    }
}
