package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_collections_acct_groups_array", propOrder = {
    "a2CollectionsAcctGroupsRow"
})
public class A2CollectionsAcctGroupsArray {

    @XmlElement(name = "a2_collections_acct_groups_row")
    protected List<A2CollectionsAcctGroupsRow> a2CollectionsAcctGroupsRow;

    public List<A2CollectionsAcctGroupsRow> getA2CollectionsAcctGroupsRow() {
        if (this.a2CollectionsAcctGroupsRow == null) {
            this.a2CollectionsAcctGroupsRow = new ArrayList<A2CollectionsAcctGroupsRow>();
        }
        return this.a2CollectionsAcctGroupsRow;
    }

}
