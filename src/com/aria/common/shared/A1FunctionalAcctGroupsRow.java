package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_functional_acct_groups_row", propOrder = {
    "a1FunctionalAcctGroups"
    })
public class A1FunctionalAcctGroupsRow {

    @XmlElement(name = "a1_functional_acct_groups")
    protected Long a1FunctionalAcctGroups;
    public Long getA1FunctionalAcctGroups() {
        return a1FunctionalAcctGroups;
    }

    public void setA1FunctionalAcctGroups(Long value) {
        this.a1FunctionalAcctGroups = value;
    }

    
}
