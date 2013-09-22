package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "functional_acct_groups_array", propOrder = {
    "functionalAcctGroupsRow"
})
public class FunctionalAcctGroupsArray {

    @XmlElement(name = "functional_acct_groups_row")
    protected List<FunctionalAcctGroupsRow> functionalAcctGroupsRow;

    public List<FunctionalAcctGroupsRow> getFunctionalAcctGroupsRow() {
        if (this.functionalAcctGroupsRow == null) {
            this.functionalAcctGroupsRow = new ArrayList<FunctionalAcctGroupsRow>();
        }
        return this.functionalAcctGroupsRow;
    }

}
