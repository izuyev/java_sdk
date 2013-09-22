package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "reversible_invoices_ReturnElement", propOrder = {"invoicedAcctNo", "invoiceNo", "invoiceDate", "invoiceLineNo", "invoiceLineDescription", "invoiceLineAmount", "invoiceLineReversedAmount", "invoiceLineReversibleAmount", "invoiceLineIsRecurService", "invoiceLineRecurStartDate"})
public class ReversibleInvoicesReturnElement {

    @XmlElement(name = "invoiced_acct_no")
    protected Long invoicedAcctNo;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_date")
    protected String invoiceDate;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "invoice_line_description")
    protected String invoiceLineDescription;
    @XmlElement(name = "invoice_line_amount")
    protected Double invoiceLineAmount;
    @XmlElement(name = "invoice_line_reversed_amount")
    protected Double invoiceLineReversedAmount;
    @XmlElement(name = "invoice_line_reversible_amount")
    protected Double invoiceLineReversibleAmount;
    @XmlElement(name = "invoice_line_is_recur_service")
    protected Long invoiceLineIsRecurService;
    @XmlElement(name = "invoice_line_recur_start_date")
    protected String invoiceLineRecurStartDate;
    
    public Long getInvoicedAcctNo() {
        return invoicedAcctNo;
    }

    public void setInvoicedAcctNo(Long value) {
        this.invoicedAcctNo = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
    }

    public String getInvoiceLineDescription() {
        return invoiceLineDescription;
    }

    public void setInvoiceLineDescription(String value) {
        this.invoiceLineDescription = value;
    }

    public Double getInvoiceLineAmount() {
        return invoiceLineAmount;
    }

    public void setInvoiceLineAmount(Double value) {
        this.invoiceLineAmount = value;
    }

    public Double getInvoiceLineReversedAmount() {
        return invoiceLineReversedAmount;
    }

    public void setInvoiceLineReversedAmount(Double value) {
        this.invoiceLineReversedAmount = value;
    }

    public Double getInvoiceLineReversibleAmount() {
        return invoiceLineReversibleAmount;
    }

    public void setInvoiceLineReversibleAmount(Double value) {
        this.invoiceLineReversibleAmount = value;
    }

    public Long getInvoiceLineIsRecurService() {
        return invoiceLineIsRecurService;
    }

    public void setInvoiceLineIsRecurService(Long value) {
        this.invoiceLineIsRecurService = value;
    }

    public String getInvoiceLineRecurStartDate() {
        return invoiceLineRecurStartDate;
    }

    public void setInvoiceLineRecurStartDate(String value) {
        this.invoiceLineRecurStartDate = value;
    }

    
}
