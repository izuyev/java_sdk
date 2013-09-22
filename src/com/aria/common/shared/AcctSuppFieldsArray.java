package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acct_supp_fields_array", propOrder = {
    "acctSuppFieldsRow"
})
public class AcctSuppFieldsArray {

    @XmlElement(name = "acct_supp_fields_row")
    protected List<AcctSuppFieldsRow> acctSuppFieldsRow;

    public List<AcctSuppFieldsRow> getAcctSuppFieldsRow() {
        if (this.acctSuppFieldsRow == null) {
            this.acctSuppFieldsRow = new ArrayList<AcctSuppFieldsRow>();
        }
        return this.acctSuppFieldsRow;
    }

}
