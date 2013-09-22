package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_functional_acct_groups_row", propOrder = {
    "a4FunctionalAcctGroups"
    })
public class A4FunctionalAcctGroupsRow {

    @XmlElement(name = "a4_functional_acct_groups")
    protected Long a4FunctionalAcctGroups;
    public Long getA4FunctionalAcctGroups() {
        return a4FunctionalAcctGroups;
    }

    public void setA4FunctionalAcctGroups(Long value) {
        this.a4FunctionalAcctGroups = value;
    }

    
}
