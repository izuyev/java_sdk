package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_new_acct_invoice_line_items_ReturnElement", propOrder = {"a3InvoiceLineNo", "a3InvoicePlanNo", "a3InvoicePlanName", "a3InvoiceServiceNo", "a3InvoiceServiceName", "a3InvoiceServiceCoaId", "a3InvoiceUnits", "a3InvoiceRatePerUnit", "a3InvoiceLineAmount", "a3InvoiceLineDescription", "a3InvoiceStartDateRange", "a3InvoiceEndDateRange", "a3ClientInvoicePlanId", "a3ClientInvoiceServiceId", "a3ClientInvoiceServiceCoaCode"})
public class A3NewAcctInvoiceLineItemsReturnElement {

    @XmlElement(name = "a3_invoice_line_no")
    protected Long a3InvoiceLineNo;
    @XmlElement(name = "a3_invoice_plan_no")
    protected Long a3InvoicePlanNo;
    @XmlElement(name = "a3_invoice_plan_name")
    protected String a3InvoicePlanName;
    @XmlElement(name = "a3_invoice_service_no")
    protected Long a3InvoiceServiceNo;
    @XmlElement(name = "a3_invoice_service_name")
    protected String a3InvoiceServiceName;
    @XmlElement(name = "a3_invoice_service_coa_id")
    protected Long a3InvoiceServiceCoaId;
    @XmlElement(name = "a3_invoice_units")
    protected Double a3InvoiceUnits;
    @XmlElement(name = "a3_invoice_rate_per_unit")
    protected Double a3InvoiceRatePerUnit;
    @XmlElement(name = "a3_invoice_line_amount")
    protected Double a3InvoiceLineAmount;
    @XmlElement(name = "a3_invoice_line_description")
    protected String a3InvoiceLineDescription;
    @XmlElement(name = "a3_invoice_start_date_range")
    protected String a3InvoiceStartDateRange;
    @XmlElement(name = "a3_invoice_end_date_range")
    protected String a3InvoiceEndDateRange;
    @XmlElement(name = "a3_client_invoice_plan_id")
    protected String a3ClientInvoicePlanId;
    @XmlElement(name = "a3_client_invoice_service_id")
    protected String a3ClientInvoiceServiceId;
    @XmlElement(name = "a3_client_invoice_service_coa_code")
    protected String a3ClientInvoiceServiceCoaCode;
    
    public Long getA3InvoiceLineNo() {
        return a3InvoiceLineNo;
    }

    public void setA3InvoiceLineNo(Long value) {
        this.a3InvoiceLineNo = value;
    }

    public Long getA3InvoicePlanNo() {
        return a3InvoicePlanNo;
    }

    public void setA3InvoicePlanNo(Long value) {
        this.a3InvoicePlanNo = value;
    }

    public String getA3InvoicePlanName() {
        return a3InvoicePlanName;
    }

    public void setA3InvoicePlanName(String value) {
        this.a3InvoicePlanName = value;
    }

    public Long getA3InvoiceServiceNo() {
        return a3InvoiceServiceNo;
    }

    public void setA3InvoiceServiceNo(Long value) {
        this.a3InvoiceServiceNo = value;
    }

    public String getA3InvoiceServiceName() {
        return a3InvoiceServiceName;
    }

    public void setA3InvoiceServiceName(String value) {
        this.a3InvoiceServiceName = value;
    }

    public Long getA3InvoiceServiceCoaId() {
        return a3InvoiceServiceCoaId;
    }

    public void setA3InvoiceServiceCoaId(Long value) {
        this.a3InvoiceServiceCoaId = value;
    }

    public Double getA3InvoiceUnits() {
        return a3InvoiceUnits;
    }

    public void setA3InvoiceUnits(Double value) {
        this.a3InvoiceUnits = value;
    }

    public Double getA3InvoiceRatePerUnit() {
        return a3InvoiceRatePerUnit;
    }

    public void setA3InvoiceRatePerUnit(Double value) {
        this.a3InvoiceRatePerUnit = value;
    }

    public Double getA3InvoiceLineAmount() {
        return a3InvoiceLineAmount;
    }

    public void setA3InvoiceLineAmount(Double value) {
        this.a3InvoiceLineAmount = value;
    }

    public String getA3InvoiceLineDescription() {
        return a3InvoiceLineDescription;
    }

    public void setA3InvoiceLineDescription(String value) {
        this.a3InvoiceLineDescription = value;
    }

    public String getA3InvoiceStartDateRange() {
        return a3InvoiceStartDateRange;
    }

    public void setA3InvoiceStartDateRange(String value) {
        this.a3InvoiceStartDateRange = value;
    }

    public String getA3InvoiceEndDateRange() {
        return a3InvoiceEndDateRange;
    }

    public void setA3InvoiceEndDateRange(String value) {
        this.a3InvoiceEndDateRange = value;
    }

    public String getA3ClientInvoicePlanId() {
        return a3ClientInvoicePlanId;
    }

    public void setA3ClientInvoicePlanId(String value) {
        this.a3ClientInvoicePlanId = value;
    }

    public String getA3ClientInvoiceServiceId() {
        return a3ClientInvoiceServiceId;
    }

    public void setA3ClientInvoiceServiceId(String value) {
        this.a3ClientInvoiceServiceId = value;
    }

    public String getA3ClientInvoiceServiceCoaCode() {
        return a3ClientInvoiceServiceCoaCode;
    }

    public void setA3ClientInvoiceServiceCoaCode(String value) {
        this.a3ClientInvoiceServiceCoaCode = value;
    }

    
}
