package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_collections_acct_groups_row", propOrder = {
    "a3CollectionsAcctGroups"
    })
public class A3CollectionsAcctGroupsRow {

    @XmlElement(name = "a3_collections_acct_groups")
    protected Long a3CollectionsAcctGroups;
    public Long getA3CollectionsAcctGroups() {
        return a3CollectionsAcctGroups;
    }

    public void setA3CollectionsAcctGroups(Long value) {
        this.a3CollectionsAcctGroups = value;
    }

    
}
