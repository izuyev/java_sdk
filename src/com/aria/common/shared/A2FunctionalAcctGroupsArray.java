package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_functional_acct_groups_array", propOrder = {
    "a2FunctionalAcctGroupsRow"
})
public class A2FunctionalAcctGroupsArray {

    @XmlElement(name = "a2_functional_acct_groups_row")
    protected List<A2FunctionalAcctGroupsRow> a2FunctionalAcctGroupsRow;

    public List<A2FunctionalAcctGroupsRow> getA2FunctionalAcctGroupsRow() {
        if (this.a2FunctionalAcctGroupsRow == null) {
            this.a2FunctionalAcctGroupsRow = new ArrayList<A2FunctionalAcctGroupsRow>();
        }
        return this.a2FunctionalAcctGroupsRow;
    }

}
