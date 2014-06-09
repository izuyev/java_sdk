package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_new_acct_invoice_line_items_ReturnElement", propOrder = {"a1InvoiceLineNo", "a1InvoicePlanNo", "a1InvoicePlanName", "a1InvoiceServiceNo", "a1InvoiceServiceName", "a1InvoiceServiceCoaId", "a1InvoiceUnits", "a1InvoiceRatePerUnit", "a1InvoiceLineAmount", "a1InvoiceLineDescription", "a1InvoiceStartDateRange", "a1InvoiceEndDateRange", "a1ClientInvoicePlanId", "a1ClientInvoiceServiceId", "a1ClientInvoiceServiceCoaCode"})
public class A1NewAcctInvoiceLineItemsReturnElement {

    @XmlElement(name = "a1_invoice_line_no")
    protected Long a1InvoiceLineNo;
    @XmlElement(name = "a1_invoice_plan_no")
    protected Long a1InvoicePlanNo;
    @XmlElement(name = "a1_invoice_plan_name")
    protected String a1InvoicePlanName;
    @XmlElement(name = "a1_invoice_service_no")
    protected Long a1InvoiceServiceNo;
    @XmlElement(name = "a1_invoice_service_name")
    protected String a1InvoiceServiceName;
    @XmlElement(name = "a1_invoice_service_coa_id")
    protected Long a1InvoiceServiceCoaId;
    @XmlElement(name = "a1_invoice_units")
    protected Double a1InvoiceUnits;
    @XmlElement(name = "a1_invoice_rate_per_unit")
    protected Double a1InvoiceRatePerUnit;
    @XmlElement(name = "a1_invoice_line_amount")
    protected Double a1InvoiceLineAmount;
    @XmlElement(name = "a1_invoice_line_description")
    protected String a1InvoiceLineDescription;
    @XmlElement(name = "a1_invoice_start_date_range")
    protected String a1InvoiceStartDateRange;
    @XmlElement(name = "a1_invoice_end_date_range")
    protected String a1InvoiceEndDateRange;
    @XmlElement(name = "a1_client_invoice_plan_id")
    protected String a1ClientInvoicePlanId;
    @XmlElement(name = "a1_client_invoice_service_id")
    protected String a1ClientInvoiceServiceId;
    @XmlElement(name = "a1_client_invoice_service_coa_code")
    protected String a1ClientInvoiceServiceCoaCode;
    
    public Long getA1InvoiceLineNo() {
        return a1InvoiceLineNo;
    }

    public void setA1InvoiceLineNo(Long value) {
        this.a1InvoiceLineNo = value;
    }

    public Long getA1InvoicePlanNo() {
        return a1InvoicePlanNo;
    }

    public void setA1InvoicePlanNo(Long value) {
        this.a1InvoicePlanNo = value;
    }

    public String getA1InvoicePlanName() {
        return a1InvoicePlanName;
    }

    public void setA1InvoicePlanName(String value) {
        this.a1InvoicePlanName = value;
    }

    public Long getA1InvoiceServiceNo() {
        return a1InvoiceServiceNo;
    }

    public void setA1InvoiceServiceNo(Long value) {
        this.a1InvoiceServiceNo = value;
    }

    public String getA1InvoiceServiceName() {
        return a1InvoiceServiceName;
    }

    public void setA1InvoiceServiceName(String value) {
        this.a1InvoiceServiceName = value;
    }

    public Long getA1InvoiceServiceCoaId() {
        return a1InvoiceServiceCoaId;
    }

    public void setA1InvoiceServiceCoaId(Long value) {
        this.a1InvoiceServiceCoaId = value;
    }

    public Double getA1InvoiceUnits() {
        return a1InvoiceUnits;
    }

    public void setA1InvoiceUnits(Double value) {
        this.a1InvoiceUnits = value;
    }

    public Double getA1InvoiceRatePerUnit() {
        return a1InvoiceRatePerUnit;
    }

    public void setA1InvoiceRatePerUnit(Double value) {
        this.a1InvoiceRatePerUnit = value;
    }

    public Double getA1InvoiceLineAmount() {
        return a1InvoiceLineAmount;
    }

    public void setA1InvoiceLineAmount(Double value) {
        this.a1InvoiceLineAmount = value;
    }

    public String getA1InvoiceLineDescription() {
        return a1InvoiceLineDescription;
    }

    public void setA1InvoiceLineDescription(String value) {
        this.a1InvoiceLineDescription = value;
    }

    public String getA1InvoiceStartDateRange() {
        return a1InvoiceStartDateRange;
    }

    public void setA1InvoiceStartDateRange(String value) {
        this.a1InvoiceStartDateRange = value;
    }

    public String getA1InvoiceEndDateRange() {
        return a1InvoiceEndDateRange;
    }

    public void setA1InvoiceEndDateRange(String value) {
        this.a1InvoiceEndDateRange = value;
    }

    public String getA1ClientInvoicePlanId() {
        return a1ClientInvoicePlanId;
    }

    public void setA1ClientInvoicePlanId(String value) {
        this.a1ClientInvoicePlanId = value;
    }

    public String getA1ClientInvoiceServiceId() {
        return a1ClientInvoiceServiceId;
    }

    public void setA1ClientInvoiceServiceId(String value) {
        this.a1ClientInvoiceServiceId = value;
    }

    public String getA1ClientInvoiceServiceCoaCode() {
        return a1ClientInvoiceServiceCoaCode;
    }

    public void setA1ClientInvoiceServiceCoaCode(String value) {
        this.a1ClientInvoiceServiceCoaCode = value;
    }

    
}
