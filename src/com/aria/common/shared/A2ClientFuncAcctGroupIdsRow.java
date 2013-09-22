package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_func_acct_group_ids_row", propOrder = {
    "a2ClientFuncAcctGroupIds"
    })
public class A2ClientFuncAcctGroupIdsRow {

    @XmlElement(name = "a2_client_func_acct_group_ids")
    protected String a2ClientFuncAcctGroupIds;
    public String getA2ClientFuncAcctGroupIds() {
        return a2ClientFuncAcctGroupIds;
    }

    public void setA2ClientFuncAcctGroupIds(String value) {
        this.a2ClientFuncAcctGroupIds = value;
    }

    
}
