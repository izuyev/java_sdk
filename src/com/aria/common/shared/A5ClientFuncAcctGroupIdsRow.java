package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_func_acct_group_ids_row", propOrder = {
    "a5ClientFuncAcctGroupIds"
    })
public class A5ClientFuncAcctGroupIdsRow {

    @XmlElement(name = "a5_client_func_acct_group_ids")
    protected String a5ClientFuncAcctGroupIds;
    public String getA5ClientFuncAcctGroupIds() {
        return a5ClientFuncAcctGroupIds;
    }

    public void setA5ClientFuncAcctGroupIds(String value) {
        this.a5ClientFuncAcctGroupIds = value;
    }

    
}
