package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "new_acct_invoice_line_items_ReturnElement", propOrder = {"invoiceLineNo", "invoicePlanNo", "invoicePlanName", "invoiceServiceNo", "invoiceServiceName", "invoiceServiceCoaId", "invoiceUnits", "invoiceRatePerUnit", "invoiceLineAmount", "invoiceLineDescription", "invoiceStartDateRange", "invoiceEndDateRange"})
public class NewAcctInvoiceLineItemsReturnElement {

    @XmlElement(name = "invoice_line_no")
    protected Long invoiceLineNo;
    @XmlElement(name = "invoice_plan_no")
    protected Long invoicePlanNo;
    @XmlElement(name = "invoice_plan_name")
    protected String invoicePlanName;
    @XmlElement(name = "invoice_service_no")
    protected Long invoiceServiceNo;
    @XmlElement(name = "invoice_service_name")
    protected String invoiceServiceName;
    @XmlElement(name = "invoice_service_coa_id")
    protected Long invoiceServiceCoaId;
    @XmlElement(name = "invoice_units")
    protected Double invoiceUnits;
    @XmlElement(name = "invoice_rate_per_unit")
    protected Double invoiceRatePerUnit;
    @XmlElement(name = "invoice_line_amount")
    protected Double invoiceLineAmount;
    @XmlElement(name = "invoice_line_description")
    protected String invoiceLineDescription;
    @XmlElement(name = "invoice_start_date_range")
    protected String invoiceStartDateRange;
    @XmlElement(name = "invoice_end_date_range")
    protected String invoiceEndDateRange;
    
    public Long getInvoiceLineNo() {
        return invoiceLineNo;
    }

    public void setInvoiceLineNo(Long value) {
        this.invoiceLineNo = value;
    }

    public Long getInvoicePlanNo() {
        return invoicePlanNo;
    }

    public void setInvoicePlanNo(Long value) {
        this.invoicePlanNo = value;
    }

    public String getInvoicePlanName() {
        return invoicePlanName;
    }

    public void setInvoicePlanName(String value) {
        this.invoicePlanName = value;
    }

    public Long getInvoiceServiceNo() {
        return invoiceServiceNo;
    }

    public void setInvoiceServiceNo(Long value) {
        this.invoiceServiceNo = value;
    }

    public String getInvoiceServiceName() {
        return invoiceServiceName;
    }

    public void setInvoiceServiceName(String value) {
        this.invoiceServiceName = value;
    }

    public Long getInvoiceServiceCoaId() {
        return invoiceServiceCoaId;
    }

    public void setInvoiceServiceCoaId(Long value) {
        this.invoiceServiceCoaId = value;
    }

    public Double getInvoiceUnits() {
        return invoiceUnits;
    }

    public void setInvoiceUnits(Double value) {
        this.invoiceUnits = value;
    }

    public Double getInvoiceRatePerUnit() {
        return invoiceRatePerUnit;
    }

    public void setInvoiceRatePerUnit(Double value) {
        this.invoiceRatePerUnit = value;
    }

    public Double getInvoiceLineAmount() {
        return invoiceLineAmount;
    }

    public void setInvoiceLineAmount(Double value) {
        this.invoiceLineAmount = value;
    }

    public String getInvoiceLineDescription() {
        return invoiceLineDescription;
    }

    public void setInvoiceLineDescription(String value) {
        this.invoiceLineDescription = value;
    }

    public String getInvoiceStartDateRange() {
        return invoiceStartDateRange;
    }

    public void setInvoiceStartDateRange(String value) {
        this.invoiceStartDateRange = value;
    }

    public String getInvoiceEndDateRange() {
        return invoiceEndDateRange;
    }

    public void setInvoiceEndDateRange(String value) {
        this.invoiceEndDateRange = value;
    }

    
}
