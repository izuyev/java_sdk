package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_functional_acct_groups_row", propOrder = {
    "a3FunctionalAcctGroups"
    })
public class A3FunctionalAcctGroupsRow {

    @XmlElement(name = "a3_functional_acct_groups")
    protected Long a3FunctionalAcctGroups;
    public Long getA3FunctionalAcctGroups() {
        return a3FunctionalAcctGroups;
    }

    public void setA3FunctionalAcctGroups(Long value) {
        this.a3FunctionalAcctGroups = value;
    }

    
}
