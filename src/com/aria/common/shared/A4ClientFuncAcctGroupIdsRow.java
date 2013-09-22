package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_func_acct_group_ids_row", propOrder = {
    "a4ClientFuncAcctGroupIds"
    })
public class A4ClientFuncAcctGroupIdsRow {

    @XmlElement(name = "a4_client_func_acct_group_ids")
    protected String a4ClientFuncAcctGroupIds;
    public String getA4ClientFuncAcctGroupIds() {
        return a4ClientFuncAcctGroupIds;
    }

    public void setA4ClientFuncAcctGroupIds(String value) {
        this.a4ClientFuncAcctGroupIds = value;
    }

    
}
