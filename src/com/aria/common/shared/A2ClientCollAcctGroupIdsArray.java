package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_coll_acct_group_ids_array", propOrder = {
    "a2ClientCollAcctGroupIdsRow"
})
public class A2ClientCollAcctGroupIdsArray {

    @XmlElement(name = "a2_client_coll_acct_group_ids_row")
    protected List<A2ClientCollAcctGroupIdsRow> a2ClientCollAcctGroupIdsRow;

    public List<A2ClientCollAcctGroupIdsRow> getA2ClientCollAcctGroupIdsRow() {
        if (this.a2ClientCollAcctGroupIdsRow == null) {
            this.a2ClientCollAcctGroupIdsRow = new ArrayList<A2ClientCollAcctGroupIdsRow>();
        }
        return this.a2ClientCollAcctGroupIdsRow;
    }

}
