package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collections_acct_groups_array", propOrder = {
    "collectionsAcctGroupsRow"
})
public class CollectionsAcctGroupsArray {

    @XmlElement(name = "collections_acct_groups_row")
    protected List<CollectionsAcctGroupsRow> collectionsAcctGroupsRow;

    public List<CollectionsAcctGroupsRow> getCollectionsAcctGroupsRow() {
        if (this.collectionsAcctGroupsRow == null) {
            this.collectionsAcctGroupsRow = new ArrayList<CollectionsAcctGroupsRow>();
        }
        return this.collectionsAcctGroupsRow;
    }

}
