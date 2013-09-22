package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_functional_acct_groups_row", propOrder = {
    "a2FunctionalAcctGroups"
    })
public class A2FunctionalAcctGroupsRow {

    @XmlElement(name = "a2_functional_acct_groups")
    protected Long a2FunctionalAcctGroups;
    public Long getA2FunctionalAcctGroups() {
        return a2FunctionalAcctGroups;
    }

    public void setA2FunctionalAcctGroups(Long value) {
        this.a2FunctionalAcctGroups = value;
    }

    
}
