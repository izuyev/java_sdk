package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_coll_acct_group_ids_row", propOrder = {
    "a5ClientCollAcctGroupIds"
    })
public class A5ClientCollAcctGroupIdsRow {

    @XmlElement(name = "a5_client_coll_acct_group_ids")
    protected String a5ClientCollAcctGroupIds;
    public String getA5ClientCollAcctGroupIds() {
        return a5ClientCollAcctGroupIds;
    }

    public void setA5ClientCollAcctGroupIds(String value) {
        this.a5ClientCollAcctGroupIds = value;
    }

    
}
