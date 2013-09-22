package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_collections_acct_groups_row", propOrder = {
    "a2CollectionsAcctGroups"
    })
public class A2CollectionsAcctGroupsRow {

    @XmlElement(name = "a2_collections_acct_groups")
    protected Long a2CollectionsAcctGroups;
    public Long getA2CollectionsAcctGroups() {
        return a2CollectionsAcctGroups;
    }

    public void setA2CollectionsAcctGroups(Long value) {
        this.a2CollectionsAcctGroups = value;
    }

    
}
