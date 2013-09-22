package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_collections_acct_groups_array", propOrder = {
    "a1CollectionsAcctGroupsRow"
})
public class A1CollectionsAcctGroupsArray {

    @XmlElement(name = "a1_collections_acct_groups_row")
    protected List<A1CollectionsAcctGroupsRow> a1CollectionsAcctGroupsRow;

    public List<A1CollectionsAcctGroupsRow> getA1CollectionsAcctGroupsRow() {
        if (this.a1CollectionsAcctGroupsRow == null) {
            this.a1CollectionsAcctGroupsRow = new ArrayList<A1CollectionsAcctGroupsRow>();
        }
        return this.a1CollectionsAcctGroupsRow;
    }

}
