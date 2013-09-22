package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_func_acct_group_ids_array", propOrder = {
    "a1ClientFuncAcctGroupIdsRow"
})
public class A1ClientFuncAcctGroupIdsArray {

    @XmlElement(name = "a1_client_func_acct_group_ids_row")
    protected List<A1ClientFuncAcctGroupIdsRow> a1ClientFuncAcctGroupIdsRow;

    public List<A1ClientFuncAcctGroupIdsRow> getA1ClientFuncAcctGroupIdsRow() {
        if (this.a1ClientFuncAcctGroupIdsRow == null) {
            this.a1ClientFuncAcctGroupIdsRow = new ArrayList<A1ClientFuncAcctGroupIdsRow>();
        }
        return this.a1ClientFuncAcctGroupIdsRow;
    }

}
