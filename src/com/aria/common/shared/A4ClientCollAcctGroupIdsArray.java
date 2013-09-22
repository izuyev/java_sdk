package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_coll_acct_group_ids_array", propOrder = {
    "a4ClientCollAcctGroupIdsRow"
})
public class A4ClientCollAcctGroupIdsArray {

    @XmlElement(name = "a4_client_coll_acct_group_ids_row")
    protected List<A4ClientCollAcctGroupIdsRow> a4ClientCollAcctGroupIdsRow;

    public List<A4ClientCollAcctGroupIdsRow> getA4ClientCollAcctGroupIdsRow() {
        if (this.a4ClientCollAcctGroupIdsRow == null) {
            this.a4ClientCollAcctGroupIdsRow = new ArrayList<A4ClientCollAcctGroupIdsRow>();
        }
        return this.a4ClientCollAcctGroupIdsRow;
    }

}
