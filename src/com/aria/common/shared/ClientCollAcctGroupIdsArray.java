package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_coll_acct_group_ids_array", propOrder = {
    "clientCollAcctGroupIdsRow"
})
public class ClientCollAcctGroupIdsArray {

    @XmlElement(name = "client_coll_acct_group_ids_row")
    protected List<ClientCollAcctGroupIdsRow> clientCollAcctGroupIdsRow;

    public List<ClientCollAcctGroupIdsRow> getClientCollAcctGroupIdsRow() {
        if (this.clientCollAcctGroupIdsRow == null) {
            this.clientCollAcctGroupIdsRow = new ArrayList<ClientCollAcctGroupIdsRow>();
        }
        return this.clientCollAcctGroupIdsRow;
    }

}
