package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_functional_acct_groups_array", propOrder = {
    "a1FunctionalAcctGroupsRow"
})
public class A1FunctionalAcctGroupsArray {

    @XmlElement(name = "a1_functional_acct_groups_row")
    protected List<A1FunctionalAcctGroupsRow> a1FunctionalAcctGroupsRow;

    public List<A1FunctionalAcctGroupsRow> getA1FunctionalAcctGroupsRow() {
        if (this.a1FunctionalAcctGroupsRow == null) {
            this.a1FunctionalAcctGroupsRow = new ArrayList<A1FunctionalAcctGroupsRow>();
        }
        return this.a1FunctionalAcctGroupsRow;
    }

}
