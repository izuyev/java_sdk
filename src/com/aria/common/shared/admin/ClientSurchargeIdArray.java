package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_surcharge_id_array", propOrder = {
    "clientSurchargeIdRow"
})
public class ClientSurchargeIdArray {

    @XmlElement(name = "client_surcharge_id_row")
    protected List<ClientSurchargeIdRow> clientSurchargeIdRow;

    public List<ClientSurchargeIdRow> getClientSurchargeIdRow() {
        if (this.clientSurchargeIdRow == null) {
            this.clientSurchargeIdRow = new ArrayList<ClientSurchargeIdRow>();
        }
        return this.clientSurchargeIdRow;
    }

}
