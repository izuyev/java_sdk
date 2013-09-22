package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_charge_transaction_id_row", propOrder = {
    "specificChargeTransactionId"
    })
public class SpecificChargeTransactionIdRow {

    @XmlElement(name = "specific_charge_transaction_id")
    protected Long specificChargeTransactionId;
    public Long getSpecificChargeTransactionId() {
        return specificChargeTransactionId;
    }

    public void setSpecificChargeTransactionId(Long value) {
        this.specificChargeTransactionId = value;
    }

    
}
