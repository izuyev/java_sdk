package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_func_acct_group_ids_row", propOrder = {
    "a1ClientFuncAcctGroupIds"
    })
public class A1ClientFuncAcctGroupIdsRow {

    @XmlElement(name = "a1_client_func_acct_group_ids")
    protected String a1ClientFuncAcctGroupIds;
    public String getA1ClientFuncAcctGroupIds() {
        return a1ClientFuncAcctGroupIds;
    }

    public void setA1ClientFuncAcctGroupIds(String value) {
        this.a1ClientFuncAcctGroupIds = value;
    }

    
}
