package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "price_row", propOrder = {
    "amount"
    })
public class PriceRow {

    @XmlElement(name = "amount")
    protected Long amount;
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long value) {
        this.amount = value;
    }

    
}
