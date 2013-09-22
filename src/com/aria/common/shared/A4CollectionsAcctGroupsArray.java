package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_collections_acct_groups_array", propOrder = {
    "a4CollectionsAcctGroupsRow"
})
public class A4CollectionsAcctGroupsArray {

    @XmlElement(name = "a4_collections_acct_groups_row")
    protected List<A4CollectionsAcctGroupsRow> a4CollectionsAcctGroupsRow;

    public List<A4CollectionsAcctGroupsRow> getA4CollectionsAcctGroupsRow() {
        if (this.a4CollectionsAcctGroupsRow == null) {
            this.a4CollectionsAcctGroupsRow = new ArrayList<A4CollectionsAcctGroupsRow>();
        }
        return this.a4CollectionsAcctGroupsRow;
    }

}
