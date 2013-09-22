package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_func_acct_group_ids_row", propOrder = {
    "clientFuncAcctGroupIds"
    })
public class ClientFuncAcctGroupIdsRow {

    @XmlElement(name = "client_func_acct_group_ids")
    protected String clientFuncAcctGroupIds;
    public String getClientFuncAcctGroupIds() {
        return clientFuncAcctGroupIds;
    }

    public void setClientFuncAcctGroupIds(String value) {
        this.clientFuncAcctGroupIds = value;
    }

    
}
