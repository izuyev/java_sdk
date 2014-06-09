package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurring_credit_no_row", propOrder = {
    "recurringCreditNo"
    })
public class RecurringCreditNoRow {

    @XmlElement(name = "recurring_credit_no")
    protected Long recurringCreditNo;
    public Long getRecurringCreditNo() {
        return recurringCreditNo;
    }

    public void setRecurringCreditNo(Long value) {
        this.recurringCreditNo = value;
    }

    
}
