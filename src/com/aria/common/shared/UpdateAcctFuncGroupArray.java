package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update_acct_func_group_array", propOrder = {
    "updateAcctFuncGroupRow"
})
public class UpdateAcctFuncGroupArray {

    @XmlElement(name = "update_acct_func_group_row")
    protected List<UpdateAcctFuncGroupRow> updateAcctFuncGroupRow;

    public List<UpdateAcctFuncGroupRow> getUpdateAcctFuncGroupRow() {
        if (this.updateAcctFuncGroupRow == null) {
            this.updateAcctFuncGroupRow = new ArrayList<UpdateAcctFuncGroupRow>();
        }
        return this.updateAcctFuncGroupRow;
    }

}
