package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_func_acct_group_ids_array", propOrder = {
    "a5ClientFuncAcctGroupIdsRow"
})
public class A5ClientFuncAcctGroupIdsArray {

    @XmlElement(name = "a5_client_func_acct_group_ids_row")
    protected List<A5ClientFuncAcctGroupIdsRow> a5ClientFuncAcctGroupIdsRow;

    public List<A5ClientFuncAcctGroupIdsRow> getA5ClientFuncAcctGroupIdsRow() {
        if (this.a5ClientFuncAcctGroupIdsRow == null) {
            this.a5ClientFuncAcctGroupIdsRow = new ArrayList<A5ClientFuncAcctGroupIdsRow>();
        }
        return this.a5ClientFuncAcctGroupIdsRow;
    }

}
