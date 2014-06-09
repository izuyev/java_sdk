package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_service_id_array", propOrder = {
    "clientServiceIdRow"
})
public class ClientServiceIdArray {

    @XmlElement(name = "client_service_id_row")
    protected List<ClientServiceIdRow> clientServiceIdRow;

    public List<ClientServiceIdRow> getClientServiceIdRow() {
        if (this.clientServiceIdRow == null) {
            this.clientServiceIdRow = new ArrayList<ClientServiceIdRow>();
        }
        return this.clientServiceIdRow;
    }

}
