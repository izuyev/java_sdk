package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "writeoff_details_ReturnElement", propOrder = {"invoiceNo", "invoiceBillDate", "invoiceLineNo", "totalLineDebit", "writeoffLineAmount", "writeoffLineStartDate", "writeoffLineEndDate"})
public class WriteoffDetailsReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_bill_date")
    protected String invoiceBillDate;
    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "total_line_debit")
    protected Double totalLineDebit;
    @XmlElement(name = "writeoff_line_amount")
    protected Double writeoffLineAmount;
    @XmlElement(name = "writeoff_line_start_date")
    protected String writeoffLineStartDate;
    @XmlElement(name = "writeoff_line_end_date")
    protected String writeoffLineEndDate;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getInvoiceBillDate() {
        return invoiceBillDate;
    }

    public void setInvoiceBillDate(String value) {
        this.invoiceBillDate = value;
    }

    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
    }

    public Double getTotalLineDebit() {
        return totalLineDebit;
    }

    public void setTotalLineDebit(Double value) {
        this.totalLineDebit = value;
    }

    public Double getWriteoffLineAmount() {
        return writeoffLineAmount;
    }

    public void setWriteoffLineAmount(Double value) {
        this.writeoffLineAmount = value;
    }

    public String getWriteoffLineStartDate() {
        return writeoffLineStartDate;
    }

    public void setWriteoffLineStartDate(String value) {
        this.writeoffLineStartDate = value;
    }

    public String getWriteoffLineEndDate() {
        return writeoffLineEndDate;
    }

    public void setWriteoffLineEndDate(String value) {
        this.writeoffLineEndDate = value;
    }

    
}
