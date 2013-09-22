package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payment_application_details_ReturnElement", propOrder = {"invoiceNo", "invoiceDate", "invoiceFromDate", "invoiceToDate", "invoicePayAppliedAmount", "invoiceOverallPaidAmount", "invoiceCharge", "invoiceCredit", "invoiceBalDue"})
public class PaymentApplicationDetailsReturnElement {

    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "invoice_date")
    protected String invoiceDate;
    @XmlElement(name = "invoice_from_date")
    protected String invoiceFromDate;
    @XmlElement(name = "invoice_to_date")
    protected String invoiceToDate;
    @XmlElement(name = "invoice_pay_applied_amount")
    protected Double invoicePayAppliedAmount;
    @XmlElement(name = "invoice_overall_paid_amount")
    protected Double invoiceOverallPaidAmount;
    @XmlElement(name = "invoice_charge")
    protected Double invoiceCharge;
    @XmlElement(name = "invoice_credit")
    protected Double invoiceCredit;
    @XmlElement(name = "invoice_bal_due")
    protected Double invoiceBalDue;
    
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

    public String getInvoiceFromDate() {
        return invoiceFromDate;
    }

    public void setInvoiceFromDate(String value) {
        this.invoiceFromDate = value;
    }

    public String getInvoiceToDate() {
        return invoiceToDate;
    }

    public void setInvoiceToDate(String value) {
        this.invoiceToDate = value;
    }

    public Double getInvoicePayAppliedAmount() {
        return invoicePayAppliedAmount;
    }

    public void setInvoicePayAppliedAmount(Double value) {
        this.invoicePayAppliedAmount = value;
    }

    public Double getInvoiceOverallPaidAmount() {
        return invoiceOverallPaidAmount;
    }

    public void setInvoiceOverallPaidAmount(Double value) {
        this.invoiceOverallPaidAmount = value;
    }

    public Double getInvoiceCharge() {
        return invoiceCharge;
    }

    public void setInvoiceCharge(Double value) {
        this.invoiceCharge = value;
    }

    public Double getInvoiceCredit() {
        return invoiceCredit;
    }

    public void setInvoiceCredit(Double value) {
        this.invoiceCredit = value;
    }

    public Double getInvoiceBalDue() {
        return invoiceBalDue;
    }

    public void setInvoiceBalDue(Double value) {
        this.invoiceBalDue = value;
    }

    
}
