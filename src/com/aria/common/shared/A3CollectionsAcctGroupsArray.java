package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_collections_acct_groups_array", propOrder = {
    "a3CollectionsAcctGroupsRow"
})
public class A3CollectionsAcctGroupsArray {

    @XmlElement(name = "a3_collections_acct_groups_row")
    protected List<A3CollectionsAcctGroupsRow> a3CollectionsAcctGroupsRow;

    public List<A3CollectionsAcctGroupsRow> getA3CollectionsAcctGroupsRow() {
        if (this.a3CollectionsAcctGroupsRow == null) {
            this.a3CollectionsAcctGroupsRow = new ArrayList<A3CollectionsAcctGroupsRow>();
        }
        return this.a3CollectionsAcctGroupsRow;
    }

}
