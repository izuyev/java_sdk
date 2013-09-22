package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collections_acct_groups_row", propOrder = {
    "collectionsAcctGroups"
    })
public class CollectionsAcctGroupsRow {

    @XmlElement(name = "collections_acct_groups")
    protected Long collectionsAcctGroups;
    public Long getCollectionsAcctGroups() {
        return collectionsAcctGroups;
    }

    public void setCollectionsAcctGroups(Long value) {
        this.collectionsAcctGroups = value;
    }

    
}
