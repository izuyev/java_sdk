package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_new_acct_invoice_line_items_ReturnElement", propOrder = {"a4InvoiceLineNo", "a4InvoicePlanNo", "a4InvoicePlanName", "a4InvoiceServiceNo", "a4InvoiceServiceName", "a4InvoiceServiceCoaId", "a4InvoiceUnits", "a4InvoiceRatePerUnit", "a4InvoiceLineAmount", "a4InvoiceLineDescription", "a4InvoiceStartDateRange", "a4InvoiceEndDateRange"})
public class A4NewAcctInvoiceLineItemsReturnElement {

    @XmlElement(name = "a4_invoice_line_no")
    protected Long a4InvoiceLineNo;
    @XmlElement(name = "a4_invoice_plan_no")
    protected Long a4InvoicePlanNo;
    @XmlElement(name = "a4_invoice_plan_name")
    protected String a4InvoicePlanName;
    @XmlElement(name = "a4_invoice_service_no")
    protected Long a4InvoiceServiceNo;
    @XmlElement(name = "a4_invoice_service_name")
    protected String a4InvoiceServiceName;
    @XmlElement(name = "a4_invoice_service_coa_id")
    protected Long a4InvoiceServiceCoaId;
    @XmlElement(name = "a4_invoice_units")
    protected Double a4InvoiceUnits;
    @XmlElement(name = "a4_invoice_rate_per_unit")
    protected Double a4InvoiceRatePerUnit;
    @XmlElement(name = "a4_invoice_line_amount")
    protected Double a4InvoiceLineAmount;
    @XmlElement(name = "a4_invoice_line_description")
    protected String a4InvoiceLineDescription;
    @XmlElement(name = "a4_invoice_start_date_range")
    protected String a4InvoiceStartDateRange;
    @XmlElement(name = "a4_invoice_end_date_range")
    protected String a4InvoiceEndDateRange;
    
    public Long getA4InvoiceLineNo() {
        return a4InvoiceLineNo;
    }

    public void setA4InvoiceLineNo(Long value) {
        this.a4InvoiceLineNo = value;
    }

    public Long getA4InvoicePlanNo() {
        return a4InvoicePlanNo;
    }

    public void setA4InvoicePlanNo(Long value) {
        this.a4InvoicePlanNo = value;
    }

    public String getA4InvoicePlanName() {
        return a4InvoicePlanName;
    }

    public void setA4InvoicePlanName(String value) {
        this.a4InvoicePlanName = value;
    }

    public Long getA4InvoiceServiceNo() {
        return a4InvoiceServiceNo;
    }

    public void setA4InvoiceServiceNo(Long value) {
        this.a4InvoiceServiceNo = value;
    }

    public String getA4InvoiceServiceName() {
        return a4InvoiceServiceName;
    }

    public void setA4InvoiceServiceName(String value) {
        this.a4InvoiceServiceName = value;
    }

    public Long getA4InvoiceServiceCoaId() {
        return a4InvoiceServiceCoaId;
    }

    public void setA4InvoiceServiceCoaId(Long value) {
        this.a4InvoiceServiceCoaId = value;
    }

    public Double getA4InvoiceUnits() {
        return a4InvoiceUnits;
    }

    public void setA4InvoiceUnits(Double value) {
        this.a4InvoiceUnits = value;
    }

    public Double getA4InvoiceRatePerUnit() {
        return a4InvoiceRatePerUnit;
    }

    public void setA4InvoiceRatePerUnit(Double value) {
        this.a4InvoiceRatePerUnit = value;
    }

    public Double getA4InvoiceLineAmount() {
        return a4InvoiceLineAmount;
    }

    public void setA4InvoiceLineAmount(Double value) {
        this.a4InvoiceLineAmount = value;
    }

    public String getA4InvoiceLineDescription() {
        return a4InvoiceLineDescription;
    }

    public void setA4InvoiceLineDescription(String value) {
        this.a4InvoiceLineDescription = value;
    }

    public String getA4InvoiceStartDateRange() {
        return a4InvoiceStartDateRange;
    }

    public void setA4InvoiceStartDateRange(String value) {
        this.a4InvoiceStartDateRange = value;
    }

    public String getA4InvoiceEndDateRange() {
        return a4InvoiceEndDateRange;
    }

    public void setA4InvoiceEndDateRange(String value) {
        this.a4InvoiceEndDateRange = value;
    }

    
}
