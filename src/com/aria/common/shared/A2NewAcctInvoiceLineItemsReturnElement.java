package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_new_acct_invoice_line_items_ReturnElement", propOrder = {"a2InvoiceLineNo", "a2InvoicePlanNo", "a2InvoicePlanName", "a2InvoiceServiceNo", "a2InvoiceServiceName", "a2InvoiceServiceCoaId", "a2InvoiceUnits", "a2InvoiceRatePerUnit", "a2InvoiceLineAmount", "a2InvoiceLineDescription", "a2InvoiceStartDateRange", "a2InvoiceEndDateRange", "a2ClientInvoicePlanId", "a2ClientInvoiceServiceId", "a2ClientInvoiceServiceCoaCode"})
public class A2NewAcctInvoiceLineItemsReturnElement {

    @XmlElement(name = "a2_invoice_line_no")
    protected Long a2InvoiceLineNo;
    @XmlElement(name = "a2_invoice_plan_no")
    protected Long a2InvoicePlanNo;
    @XmlElement(name = "a2_invoice_plan_name")
    protected String a2InvoicePlanName;
    @XmlElement(name = "a2_invoice_service_no")
    protected Long a2InvoiceServiceNo;
    @XmlElement(name = "a2_invoice_service_name")
    protected String a2InvoiceServiceName;
    @XmlElement(name = "a2_invoice_service_coa_id")
    protected Long a2InvoiceServiceCoaId;
    @XmlElement(name = "a2_invoice_units")
    protected Double a2InvoiceUnits;
    @XmlElement(name = "a2_invoice_rate_per_unit")
    protected Double a2InvoiceRatePerUnit;
    @XmlElement(name = "a2_invoice_line_amount")
    protected Double a2InvoiceLineAmount;
    @XmlElement(name = "a2_invoice_line_description")
    protected String a2InvoiceLineDescription;
    @XmlElement(name = "a2_invoice_start_date_range")
    protected String a2InvoiceStartDateRange;
    @XmlElement(name = "a2_invoice_end_date_range")
    protected String a2InvoiceEndDateRange;
    @XmlElement(name = "a2_client_invoice_plan_id")
    protected String a2ClientInvoicePlanId;
    @XmlElement(name = "a2_client_invoice_service_id")
    protected String a2ClientInvoiceServiceId;
    @XmlElement(name = "a2_client_invoice_service_coa_code")
    protected String a2ClientInvoiceServiceCoaCode;
    
    public Long getA2InvoiceLineNo() {
        return a2InvoiceLineNo;
    }

    public void setA2InvoiceLineNo(Long value) {
        this.a2InvoiceLineNo = value;
    }

    public Long getA2InvoicePlanNo() {
        return a2InvoicePlanNo;
    }

    public void setA2InvoicePlanNo(Long value) {
        this.a2InvoicePlanNo = value;
    }

    public String getA2InvoicePlanName() {
        return a2InvoicePlanName;
    }

    public void setA2InvoicePlanName(String value) {
        this.a2InvoicePlanName = value;
    }

    public Long getA2InvoiceServiceNo() {
        return a2InvoiceServiceNo;
    }

    public void setA2InvoiceServiceNo(Long value) {
        this.a2InvoiceServiceNo = value;
    }

    public String getA2InvoiceServiceName() {
        return a2InvoiceServiceName;
    }

    public void setA2InvoiceServiceName(String value) {
        this.a2InvoiceServiceName = value;
    }

    public Long getA2InvoiceServiceCoaId() {
        return a2InvoiceServiceCoaId;
    }

    public void setA2InvoiceServiceCoaId(Long value) {
        this.a2InvoiceServiceCoaId = value;
    }

    public Double getA2InvoiceUnits() {
        return a2InvoiceUnits;
    }

    public void setA2InvoiceUnits(Double value) {
        this.a2InvoiceUnits = value;
    }

    public Double getA2InvoiceRatePerUnit() {
        return a2InvoiceRatePerUnit;
    }

    public void setA2InvoiceRatePerUnit(Double value) {
        this.a2InvoiceRatePerUnit = value;
    }

    public Double getA2InvoiceLineAmount() {
        return a2InvoiceLineAmount;
    }

    public void setA2InvoiceLineAmount(Double value) {
        this.a2InvoiceLineAmount = value;
    }

    public String getA2InvoiceLineDescription() {
        return a2InvoiceLineDescription;
    }

    public void setA2InvoiceLineDescription(String value) {
        this.a2InvoiceLineDescription = value;
    }

    public String getA2InvoiceStartDateRange() {
        return a2InvoiceStartDateRange;
    }

    public void setA2InvoiceStartDateRange(String value) {
        this.a2InvoiceStartDateRange = value;
    }

    public String getA2InvoiceEndDateRange() {
        return a2InvoiceEndDateRange;
    }

    public void setA2InvoiceEndDateRange(String value) {
        this.a2InvoiceEndDateRange = value;
    }

    public String getA2ClientInvoicePlanId() {
        return a2ClientInvoicePlanId;
    }

    public void setA2ClientInvoicePlanId(String value) {
        this.a2ClientInvoicePlanId = value;
    }

    public String getA2ClientInvoiceServiceId() {
        return a2ClientInvoiceServiceId;
    }

    public void setA2ClientInvoiceServiceId(String value) {
        this.a2ClientInvoiceServiceId = value;
    }

    public String getA2ClientInvoiceServiceCoaCode() {
        return a2ClientInvoiceServiceCoaCode;
    }

    public void setA2ClientInvoiceServiceCoaCode(String value) {
        this.a2ClientInvoiceServiceCoaCode = value;
    }

    
}
