package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "credit_ids_array", propOrder = {
    "creditIdsRow"
})
public class CreditIdsArray {

    @XmlElement(name = "credit_ids_row")
    protected List<CreditIdsRow> creditIdsRow;

    public List<CreditIdsRow> getCreditIdsRow() {
        if (this.creditIdsRow == null) {
            this.creditIdsRow = new ArrayList<CreditIdsRow>();
        }
        return this.creditIdsRow;
    }

}
