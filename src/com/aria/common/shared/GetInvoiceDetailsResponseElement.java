package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoiceLineItems", "isPendingInd"})
@XmlRootElement(name = "get_invoice_detailsResponseElement")
public class GetInvoiceDetailsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "invoice_line_items")
    protected List<InvoiceLineItemsReturnElement> invoiceLineItems;
    @XmlElement(name = "is_pending_ind")
    protected Long isPendingInd;
    
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

    public List<InvoiceLineItemsReturnElement> getInvoiceLineItems() {
        if (this.invoiceLineItems == null) {
            this.invoiceLineItems = new ArrayList<InvoiceLineItemsReturnElement>();
        }
        return this.invoiceLineItems;
    }public Long getIsPendingInd() {
        return isPendingInd;
    }

    public void setIsPendingInd(Long value) {
        this.isPendingInd = value;
    }

    
}
