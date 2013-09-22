package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_collections_acct_groups_array", propOrder = {
    "a5CollectionsAcctGroupsRow"
})
public class A5CollectionsAcctGroupsArray {

    @XmlElement(name = "a5_collections_acct_groups_row")
    protected List<A5CollectionsAcctGroupsRow> a5CollectionsAcctGroupsRow;

    public List<A5CollectionsAcctGroupsRow> getA5CollectionsAcctGroupsRow() {
        if (this.a5CollectionsAcctGroupsRow == null) {
            this.a5CollectionsAcctGroupsRow = new ArrayList<A5CollectionsAcctGroupsRow>();
        }
        return this.a5CollectionsAcctGroupsRow;
    }

}
