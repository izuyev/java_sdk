package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_collections_acct_groups_row", propOrder = {
    "a5CollectionsAcctGroups"
    })
public class A5CollectionsAcctGroupsRow {

    @XmlElement(name = "a5_collections_acct_groups")
    protected Long a5CollectionsAcctGroups;
    public Long getA5CollectionsAcctGroups() {
        return a5CollectionsAcctGroups;
    }

    public void setA5CollectionsAcctGroups(Long value) {
        this.a5CollectionsAcctGroups = value;
    }

    
}
