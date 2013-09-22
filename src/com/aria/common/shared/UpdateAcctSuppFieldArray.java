package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_supp_field_array", propOrder = {
    "updateAcctSuppFieldRow"
})
public class UpdateAcctSuppFieldArray {

    @XmlElement(name = "update_acct_supp_field_row")
    protected List<UpdateAcctSuppFieldRow> updateAcctSuppFieldRow;

    public List<UpdateAcctSuppFieldRow> getUpdateAcctSuppFieldRow() {
        if (this.updateAcctSuppFieldRow == null) {
            this.updateAcctSuppFieldRow = new ArrayList<UpdateAcctSuppFieldRow>();
        }
        return this.updateAcctSuppFieldRow;
    }

}
