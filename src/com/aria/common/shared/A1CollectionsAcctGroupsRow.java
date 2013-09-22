package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_collections_acct_groups_row", propOrder = {
    "a1CollectionsAcctGroups"
    })
public class A1CollectionsAcctGroupsRow {

    @XmlElement(name = "a1_collections_acct_groups")
    protected Long a1CollectionsAcctGroups;
    public Long getA1CollectionsAcctGroups() {
        return a1CollectionsAcctGroups;
    }

    public void setA1CollectionsAcctGroups(Long value) {
        this.a1CollectionsAcctGroups = value;
    }

    
}
