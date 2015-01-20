package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoice_details_ReturnElement", propOrder = {"invoiceNo", "billDate", "dueDate", "daysPastDue", "invoiceAmount", "totalPaid", "balanceDue", "invoiceTypeCd"})
public class InvoiceDetailsReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "bill_date")
    protected String billDate;
    @XmlElement(name = "due_date")
    protected String dueDate;
    @XmlElement(name = "days_past_due")
    protected Long daysPastDue;
    @XmlElement(name = "invoice_amount")
    protected Double invoiceAmount;
    @XmlElement(name = "total_paid")
    protected Double totalPaid;
    @XmlElement(name = "balance_due")
    protected Double balanceDue;
    @XmlElement(name = "invoice_type_cd")
    protected String invoiceTypeCd;
    
    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public String getBillDate() {
        return billDate;
    }

    public void setBillDate(String value) {
        this.billDate = value;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String value) {
        this.dueDate = value;
    }

    public Long getDaysPastDue() {
        return daysPastDue;
    }

    public void setDaysPastDue(Long value) {
        this.daysPastDue = value;
    }

    public Double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Double value) {
        this.invoiceAmount = value;
    }

    public Double getTotalPaid() {
        return totalPaid;
    }

    public void setTotalPaid(Double value) {
        this.totalPaid = value;
    }

    public Double getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(Double value) {
        this.balanceDue = value;
    }

    public String getInvoiceTypeCd() {
        return invoiceTypeCd;
    }

    public void setInvoiceTypeCd(String value) {
        this.invoiceTypeCd = value;
    }

    
}
