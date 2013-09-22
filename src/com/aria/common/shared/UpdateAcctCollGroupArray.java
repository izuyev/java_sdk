package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_coll_group_array", propOrder = {
    "updateAcctCollGroupRow"
})
public class UpdateAcctCollGroupArray {

    @XmlElement(name = "update_acct_coll_group_row")
    protected List<UpdateAcctCollGroupRow> updateAcctCollGroupRow;

    public List<UpdateAcctCollGroupRow> getUpdateAcctCollGroupRow() {
        if (this.updateAcctCollGroupRow == null) {
            this.updateAcctCollGroupRow = new ArrayList<UpdateAcctCollGroupRow>();
        }
        return this.updateAcctCollGroupRow;
    }

}
