package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_coll_acct_group_ids_row", propOrder = {
    "a2ClientCollAcctGroupIds"
    })
public class A2ClientCollAcctGroupIdsRow {

    @XmlElement(name = "a2_client_coll_acct_group_ids")
    protected String a2ClientCollAcctGroupIds;
    public String getA2ClientCollAcctGroupIds() {
        return a2ClientCollAcctGroupIds;
    }

    public void setA2ClientCollAcctGroupIds(String value) {
        this.a2ClientCollAcctGroupIds = value;
    }

    
}
