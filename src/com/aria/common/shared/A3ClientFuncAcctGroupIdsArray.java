package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_func_acct_group_ids_array", propOrder = {
    "a3ClientFuncAcctGroupIdsRow"
})
public class A3ClientFuncAcctGroupIdsArray {

    @XmlElement(name = "a3_client_func_acct_group_ids_row")
    protected List<A3ClientFuncAcctGroupIdsRow> a3ClientFuncAcctGroupIdsRow;

    public List<A3ClientFuncAcctGroupIdsRow> getA3ClientFuncAcctGroupIdsRow() {
        if (this.a3ClientFuncAcctGroupIdsRow == null) {
            this.a3ClientFuncAcctGroupIdsRow = new ArrayList<A3ClientFuncAcctGroupIdsRow>();
        }
        return this.a3ClientFuncAcctGroupIdsRow;
    }

}
