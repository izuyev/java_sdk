package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_collections_acct_groups_row", propOrder = {
    "a4CollectionsAcctGroups"
    })
public class A4CollectionsAcctGroupsRow {

    @XmlElement(name = "a4_collections_acct_groups")
    protected Long a4CollectionsAcctGroups;
    public Long getA4CollectionsAcctGroups() {
        return a4CollectionsAcctGroups;
    }

    public void setA4CollectionsAcctGroups(Long value) {
        this.a4CollectionsAcctGroups = value;
    }

    
}
