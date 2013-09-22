package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inv_calc_out_ReturnElement", propOrder = {"taxItemCode", "taxItemDesc", "taxItemAmount"})
public class InvCalcOutReturnElement {

    @XmlElement(name = "tax_item_code")
    protected Long taxItemCode;
    @XmlElement(name = "tax_item_desc")
    protected String taxItemDesc;
    @XmlElement(name = "tax_item_amount")
    protected Double taxItemAmount;
    
    public Long getTaxItemCode() {
        return taxItemCode;
    }

    public void setTaxItemCode(Long value) {
        this.taxItemCode = value;
    }

    public String getTaxItemDesc() {
        return taxItemDesc;
    }

    public void setTaxItemDesc(String value) {
        this.taxItemDesc = value;
    }

    public Double getTaxItemAmount() {
        return taxItemAmount;
    }

    public void setTaxItemAmount(Double value) {
        this.taxItemAmount = value;
    }

    
}
