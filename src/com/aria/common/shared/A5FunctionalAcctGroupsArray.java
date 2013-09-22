package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_functional_acct_groups_array", propOrder = {
    "a5FunctionalAcctGroupsRow"
})
public class A5FunctionalAcctGroupsArray {

    @XmlElement(name = "a5_functional_acct_groups_row")
    protected List<A5FunctionalAcctGroupsRow> a5FunctionalAcctGroupsRow;

    public List<A5FunctionalAcctGroupsRow> getA5FunctionalAcctGroupsRow() {
        if (this.a5FunctionalAcctGroupsRow == null) {
            this.a5FunctionalAcctGroupsRow = new ArrayList<A5FunctionalAcctGroupsRow>();
        }
        return this.a5FunctionalAcctGroupsRow;
    }

}
