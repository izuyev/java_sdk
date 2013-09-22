package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_coll_acct_group_ids_array", propOrder = {
    "a3ClientCollAcctGroupIdsRow"
})
public class A3ClientCollAcctGroupIdsArray {

    @XmlElement(name = "a3_client_coll_acct_group_ids_row")
    protected List<A3ClientCollAcctGroupIdsRow> a3ClientCollAcctGroupIdsRow;

    public List<A3ClientCollAcctGroupIdsRow> getA3ClientCollAcctGroupIdsRow() {
        if (this.a3ClientCollAcctGroupIdsRow == null) {
            this.a3ClientCollAcctGroupIdsRow = new ArrayList<A3ClientCollAcctGroupIdsRow>();
        }
        return this.a3ClientCollAcctGroupIdsRow;
    }

}
