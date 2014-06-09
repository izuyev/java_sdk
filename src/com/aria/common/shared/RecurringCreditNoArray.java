package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recurring_credit_no_array", propOrder = {
    "recurringCreditNoRow"
})
public class RecurringCreditNoArray {

    @XmlElement(name = "recurring_credit_no_row")
    protected List<RecurringCreditNoRow> recurringCreditNoRow;

    public List<RecurringCreditNoRow> getRecurringCreditNoRow() {
        if (this.recurringCreditNoRow == null) {
            this.recurringCreditNoRow = new ArrayList<RecurringCreditNoRow>();
        }
        return this.recurringCreditNoRow;
    }

}
