package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_coll_acct_group_ids_row", propOrder = {
    "a1ClientCollAcctGroupIds"
    })
public class A1ClientCollAcctGroupIdsRow {

    @XmlElement(name = "a1_client_coll_acct_group_ids")
    protected String a1ClientCollAcctGroupIds;
    public String getA1ClientCollAcctGroupIds() {
        return a1ClientCollAcctGroupIds;
    }

    public void setA1ClientCollAcctGroupIds(String value) {
        this.a1ClientCollAcctGroupIds = value;
    }

    
}
