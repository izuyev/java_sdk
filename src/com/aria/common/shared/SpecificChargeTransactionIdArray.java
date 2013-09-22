package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specific_charge_transaction_id_array", propOrder = {
    "specificChargeTransactionIdRow"
})
public class SpecificChargeTransactionIdArray {

    @XmlElement(name = "specific_charge_transaction_id_row")
    protected List<SpecificChargeTransactionIdRow> specificChargeTransactionIdRow;

    public List<SpecificChargeTransactionIdRow> getSpecificChargeTransactionIdRow() {
        if (this.specificChargeTransactionIdRow == null) {
            this.specificChargeTransactionIdRow = new ArrayList<SpecificChargeTransactionIdRow>();
        }
        return this.specificChargeTransactionIdRow;
    }

}
