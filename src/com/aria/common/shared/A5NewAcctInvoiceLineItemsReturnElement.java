package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_new_acct_invoice_line_items_ReturnElement", propOrder = {"a5InvoiceLineNo", "a5InvoicePlanNo", "a5InvoicePlanName", "a5InvoiceServiceNo", "a5InvoiceServiceName", "a5InvoiceServiceCoaId", "a5InvoiceUnits", "a5InvoiceRatePerUnit", "a5InvoiceLineAmount", "a5InvoiceLineDescription", "a5InvoiceStartDateRange", "a5InvoiceEndDateRange", "a5ClientInvoicePlanId", "a5ClientInvoiceServiceId", "a5ClientInvoiceServiceCoaCode"})
public class A5NewAcctInvoiceLineItemsReturnElement {

    @XmlElement(name = "a5_invoice_line_no")
    protected Long a5InvoiceLineNo;
    @XmlElement(name = "a5_invoice_plan_no")
    protected Long a5InvoicePlanNo;
    @XmlElement(name = "a5_invoice_plan_name")
    protected String a5InvoicePlanName;
    @XmlElement(name = "a5_invoice_service_no")
    protected Long a5InvoiceServiceNo;
    @XmlElement(name = "a5_invoice_service_name")
    protected String a5InvoiceServiceName;
    @XmlElement(name = "a5_invoice_service_coa_id")
    protected Long a5InvoiceServiceCoaId;
    @XmlElement(name = "a5_invoice_units")
    protected Double a5InvoiceUnits;
    @XmlElement(name = "a5_invoice_rate_per_unit")
    protected Double a5InvoiceRatePerUnit;
    @XmlElement(name = "a5_invoice_line_amount")
    protected Double a5InvoiceLineAmount;
    @XmlElement(name = "a5_invoice_line_description")
    protected String a5InvoiceLineDescription;
    @XmlElement(name = "a5_invoice_start_date_range")
    protected String a5InvoiceStartDateRange;
    @XmlElement(name = "a5_invoice_end_date_range")
    protected String a5InvoiceEndDateRange;
    @XmlElement(name = "a5_client_invoice_plan_id")
    protected String a5ClientInvoicePlanId;
    @XmlElement(name = "a5_client_invoice_service_id")
    protected String a5ClientInvoiceServiceId;
    @XmlElement(name = "a5_client_invoice_service_coa_code")
    protected String a5ClientInvoiceServiceCoaCode;
    
    public Long getA5InvoiceLineNo() {
        return a5InvoiceLineNo;
    }

    public void setA5InvoiceLineNo(Long value) {
        this.a5InvoiceLineNo = value;
    }

    public Long getA5InvoicePlanNo() {
        return a5InvoicePlanNo;
    }

    public void setA5InvoicePlanNo(Long value) {
        this.a5InvoicePlanNo = value;
    }

    public String getA5InvoicePlanName() {
        return a5InvoicePlanName;
    }

    public void setA5InvoicePlanName(String value) {
        this.a5InvoicePlanName = value;
    }

    public Long getA5InvoiceServiceNo() {
        return a5InvoiceServiceNo;
    }

    public void setA5InvoiceServiceNo(Long value) {
        this.a5InvoiceServiceNo = value;
    }

    public String getA5InvoiceServiceName() {
        return a5InvoiceServiceName;
    }

    public void setA5InvoiceServiceName(String value) {
        this.a5InvoiceServiceName = value;
    }

    public Long getA5InvoiceServiceCoaId() {
        return a5InvoiceServiceCoaId;
    }

    public void setA5InvoiceServiceCoaId(Long value) {
        this.a5InvoiceServiceCoaId = value;
    }

    public Double getA5InvoiceUnits() {
        return a5InvoiceUnits;
    }

    public void setA5InvoiceUnits(Double value) {
        this.a5InvoiceUnits = value;
    }

    public Double getA5InvoiceRatePerUnit() {
        return a5InvoiceRatePerUnit;
    }

    public void setA5InvoiceRatePerUnit(Double value) {
        this.a5InvoiceRatePerUnit = value;
    }

    public Double getA5InvoiceLineAmount() {
        return a5InvoiceLineAmount;
    }

    public void setA5InvoiceLineAmount(Double value) {
        this.a5InvoiceLineAmount = value;
    }

    public String getA5InvoiceLineDescription() {
        return a5InvoiceLineDescription;
    }

    public void setA5InvoiceLineDescription(String value) {
        this.a5InvoiceLineDescription = value;
    }

    public String getA5InvoiceStartDateRange() {
        return a5InvoiceStartDateRange;
    }

    public void setA5InvoiceStartDateRange(String value) {
        this.a5InvoiceStartDateRange = value;
    }

    public String getA5InvoiceEndDateRange() {
        return a5InvoiceEndDateRange;
    }

    public void setA5InvoiceEndDateRange(String value) {
        this.a5InvoiceEndDateRange = value;
    }

    public String getA5ClientInvoicePlanId() {
        return a5ClientInvoicePlanId;
    }

    public void setA5ClientInvoicePlanId(String value) {
        this.a5ClientInvoicePlanId = value;
    }

    public String getA5ClientInvoiceServiceId() {
        return a5ClientInvoiceServiceId;
    }

    public void setA5ClientInvoiceServiceId(String value) {
        this.a5ClientInvoiceServiceId = value;
    }

    public String getA5ClientInvoiceServiceCoaCode() {
        return a5ClientInvoiceServiceCoaCode;
    }

    public void setA5ClientInvoiceServiceCoaCode(String value) {
        this.a5ClientInvoiceServiceCoaCode = value;
    }

    
}
