package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_func_acct_group_ids_array", propOrder = {
    "a2ClientFuncAcctGroupIdsRow"
})
public class A2ClientFuncAcctGroupIdsArray {

    @XmlElement(name = "a2_client_func_acct_group_ids_row")
    protected List<A2ClientFuncAcctGroupIdsRow> a2ClientFuncAcctGroupIdsRow;

    public List<A2ClientFuncAcctGroupIdsRow> getA2ClientFuncAcctGroupIdsRow() {
        if (this.a2ClientFuncAcctGroupIdsRow == null) {
            this.a2ClientFuncAcctGroupIdsRow = new ArrayList<A2ClientFuncAcctGroupIdsRow>();
        }
        return this.a2ClientFuncAcctGroupIdsRow;
    }

}
