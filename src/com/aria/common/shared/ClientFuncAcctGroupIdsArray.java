package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_func_acct_group_ids_array", propOrder = {
    "clientFuncAcctGroupIdsRow"
})
public class ClientFuncAcctGroupIdsArray {

    @XmlElement(name = "client_func_acct_group_ids_row")
    protected List<ClientFuncAcctGroupIdsRow> clientFuncAcctGroupIdsRow;

    public List<ClientFuncAcctGroupIdsRow> getClientFuncAcctGroupIdsRow() {
        if (this.clientFuncAcctGroupIdsRow == null) {
            this.clientFuncAcctGroupIdsRow = new ArrayList<ClientFuncAcctGroupIdsRow>();
        }
        return this.clientFuncAcctGroupIdsRow;
    }

}
