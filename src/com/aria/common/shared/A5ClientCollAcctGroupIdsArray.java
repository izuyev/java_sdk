package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_coll_acct_group_ids_array", propOrder = {
    "a5ClientCollAcctGroupIdsRow"
})
public class A5ClientCollAcctGroupIdsArray {

    @XmlElement(name = "a5_client_coll_acct_group_ids_row")
    protected List<A5ClientCollAcctGroupIdsRow> a5ClientCollAcctGroupIdsRow;

    public List<A5ClientCollAcctGroupIdsRow> getA5ClientCollAcctGroupIdsRow() {
        if (this.a5ClientCollAcctGroupIdsRow == null) {
            this.a5ClientCollAcctGroupIdsRow = new ArrayList<A5ClientCollAcctGroupIdsRow>();
        }
        return this.a5ClientCollAcctGroupIdsRow;
    }

}
