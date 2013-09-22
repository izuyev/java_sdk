package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_func_acct_group_ids_array", propOrder = {
    "a4ClientFuncAcctGroupIdsRow"
})
public class A4ClientFuncAcctGroupIdsArray {

    @XmlElement(name = "a4_client_func_acct_group_ids_row")
    protected List<A4ClientFuncAcctGroupIdsRow> a4ClientFuncAcctGroupIdsRow;

    public List<A4ClientFuncAcctGroupIdsRow> getA4ClientFuncAcctGroupIdsRow() {
        if (this.a4ClientFuncAcctGroupIdsRow == null) {
            this.a4ClientFuncAcctGroupIdsRow = new ArrayList<A4ClientFuncAcctGroupIdsRow>();
        }
        return this.a4ClientFuncAcctGroupIdsRow;
    }

}
