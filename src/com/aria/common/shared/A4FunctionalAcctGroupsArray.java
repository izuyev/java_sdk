package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_functional_acct_groups_array", propOrder = {
    "a4FunctionalAcctGroupsRow"
})
public class A4FunctionalAcctGroupsArray {

    @XmlElement(name = "a4_functional_acct_groups_row")
    protected List<A4FunctionalAcctGroupsRow> a4FunctionalAcctGroupsRow;

    public List<A4FunctionalAcctGroupsRow> getA4FunctionalAcctGroupsRow() {
        if (this.a4FunctionalAcctGroupsRow == null) {
            this.a4FunctionalAcctGroupsRow = new ArrayList<A4FunctionalAcctGroupsRow>();
        }
        return this.a4FunctionalAcctGroupsRow;
    }

}
