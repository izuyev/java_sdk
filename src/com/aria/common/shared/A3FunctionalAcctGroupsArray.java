package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_functional_acct_groups_array", propOrder = {
    "a3FunctionalAcctGroupsRow"
})
public class A3FunctionalAcctGroupsArray {

    @XmlElement(name = "a3_functional_acct_groups_row")
    protected List<A3FunctionalAcctGroupsRow> a3FunctionalAcctGroupsRow;

    public List<A3FunctionalAcctGroupsRow> getA3FunctionalAcctGroupsRow() {
        if (this.a3FunctionalAcctGroupsRow == null) {
            this.a3FunctionalAcctGroupsRow = new ArrayList<A3FunctionalAcctGroupsRow>();
        }
        return this.a3FunctionalAcctGroupsRow;
    }

}
