package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_coll_acct_group_ids_row", propOrder = {
    "a3ClientCollAcctGroupIds"
    })
public class A3ClientCollAcctGroupIdsRow {

    @XmlElement(name = "a3_client_coll_acct_group_ids")
    protected String a3ClientCollAcctGroupIds;
    public String getA3ClientCollAcctGroupIds() {
        return a3ClientCollAcctGroupIds;
    }

    public void setA3ClientCollAcctGroupIds(String value) {
        this.a3ClientCollAcctGroupIds = value;
    }

    
}
