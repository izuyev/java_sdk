package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_coll_acct_group_ids_row", propOrder = {
    "clientCollAcctGroupIds"
    })
public class ClientCollAcctGroupIdsRow {

    @XmlElement(name = "client_coll_acct_group_ids")
    protected String clientCollAcctGroupIds;
    public String getClientCollAcctGroupIds() {
        return clientCollAcctGroupIds;
    }

    public void setClientCollAcctGroupIds(String value) {
        this.clientCollAcctGroupIds = value;
    }

    
}
