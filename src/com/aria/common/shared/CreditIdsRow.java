package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_ids_row", propOrder = {
    "creditIds"
    })
public class CreditIdsRow {

    @XmlElement(name = "credit_ids")
    protected String creditIds;
    public String getCreditIds() {
        return creditIds;
    }

    public void setCreditIds(String value) {
        this.creditIds = value;
    }

    
}
