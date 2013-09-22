package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_coll_acct_group_ids_row", propOrder = {
    "a4ClientCollAcctGroupIds"
    })
public class A4ClientCollAcctGroupIdsRow {

    @XmlElement(name = "a4_client_coll_acct_group_ids")
    protected String a4ClientCollAcctGroupIds;
    public String getA4ClientCollAcctGroupIds() {
        return a4ClientCollAcctGroupIds;
    }

    public void setA4ClientCollAcctGroupIds(String value) {
        this.a4ClientCollAcctGroupIds = value;
    }

    
}
