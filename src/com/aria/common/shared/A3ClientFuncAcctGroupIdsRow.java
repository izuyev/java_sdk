package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_func_acct_group_ids_row", propOrder = {
    "a3ClientFuncAcctGroupIds"
    })
public class A3ClientFuncAcctGroupIdsRow {

    @XmlElement(name = "a3_client_func_acct_group_ids")
    protected String a3ClientFuncAcctGroupIds;
    public String getA3ClientFuncAcctGroupIds() {
        return a3ClientFuncAcctGroupIds;
    }

    public void setA3ClientFuncAcctGroupIds(String value) {
        this.a3ClientFuncAcctGroupIds = value;
    }

    
}
