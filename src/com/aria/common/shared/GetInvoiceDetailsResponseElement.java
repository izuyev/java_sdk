package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "invoiceLineItems", "isPendingInd", "customStatusLabel", "customStatusDesc", "clientNotes", "invoiceTypeCd"})
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
    @XmlElement(name = "custom_status_label")
    protected String customStatusLabel;
    @XmlElement(name = "custom_status_desc")
    protected String customStatusDesc;
    @XmlElement(name = "client_notes")
    protected String clientNotes;
    @XmlElement(name = "invoice_type_cd")
    protected String invoiceTypeCd;
    
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

    public String getCustomStatusLabel() {
        return customStatusLabel;
    }

    public void setCustomStatusLabel(String value) {
        this.customStatusLabel = value;
    }

    public String getCustomStatusDesc() {
        return customStatusDesc;
    }

    public void setCustomStatusDesc(String value) {
        this.customStatusDesc = value;
    }

    public String getClientNotes() {
        return clientNotes;
    }

    public void setClientNotes(String value) {
        this.clientNotes = value;
    }

    public String getInvoiceTypeCd() {
        return invoiceTypeCd;
    }

    public void setInvoiceTypeCd(String value) {
        this.invoiceTypeCd = value;
    }

    
}
