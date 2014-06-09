package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reversed_invoice_lines_ReturnElement", propOrder = {"invoiceNo", "invoiceLineNo", "invoiceLineServiceNo", "invoiceLineReversedAmount", "invoiceLineReversingDate", "invoiceLineComments", "clientInvoiceLineServiceId"})
public class ReversedInvoiceLinesReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "invoice_line_service_no")
    protected Long invoiceLineServiceNo;
    @XmlElement(name = "invoice_line_reversed_amount")
    protected Double invoiceLineReversedAmount;
    @XmlElement(name = "invoice_line_reversing_date")
    protected String invoiceLineReversingDate;
    @XmlElement(name = "invoice_line_comments")
    protected String invoiceLineComments;
    @XmlElement(name = "client_invoice_line_service_id")
    protected String clientInvoiceLineServiceId;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
    }

    public Long getInvoiceLineServiceNo() {
        return invoiceLineServiceNo;
    }

    public void setInvoiceLineServiceNo(Long value) {
        this.invoiceLineServiceNo = value;
    }

    public Double getInvoiceLineReversedAmount() {
        return invoiceLineReversedAmount;
    }

    public void setInvoiceLineReversedAmount(Double value) {
        this.invoiceLineReversedAmount = value;
    }

    public String getInvoiceLineReversingDate() {
        return invoiceLineReversingDate;
    }

    public void setInvoiceLineReversingDate(String value) {
        this.invoiceLineReversingDate = value;
    }

    public String getInvoiceLineComments() {
        return invoiceLineComments;
    }

    public void setInvoiceLineComments(String value) {
        this.invoiceLineComments = value;
    }

    public String getClientInvoiceLineServiceId() {
        return clientInvoiceLineServiceId;
    }

    public void setClientInvoiceLineServiceId(String value) {
        this.clientInvoiceLineServiceId = value;
    }

    
}
