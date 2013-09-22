package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_functional_acct_groups_row", propOrder = {
    "a5FunctionalAcctGroups"
    })
public class A5FunctionalAcctGroupsRow {

    @XmlElement(name = "a5_functional_acct_groups")
    protected Long a5FunctionalAcctGroups;
    public Long getA5FunctionalAcctGroups() {
        return a5FunctionalAcctGroups;
    }

    public void setA5FunctionalAcctGroups(Long value) {
        this.a5FunctionalAcctGroups = value;
    }

    
}
