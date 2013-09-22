package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_coll_acct_group_ids_array", propOrder = {
    "a1ClientCollAcctGroupIdsRow"
})
public class A1ClientCollAcctGroupIdsArray {

    @XmlElement(name = "a1_client_coll_acct_group_ids_row")
    protected List<A1ClientCollAcctGroupIdsRow> a1ClientCollAcctGroupIdsRow;

    public List<A1ClientCollAcctGroupIdsRow> getA1ClientCollAcctGroupIdsRow() {
        if (this.a1ClientCollAcctGroupIdsRow == null) {
            this.a1ClientCollAcctGroupIdsRow = new ArrayList<A1ClientCollAcctGroupIdsRow>();
        }
        return this.a1ClientCollAcctGroupIdsRow;
    }

}
