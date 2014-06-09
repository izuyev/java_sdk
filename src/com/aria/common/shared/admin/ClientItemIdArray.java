package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_item_id_array", propOrder = {
    "clientItemIdRow"
})
public class ClientItemIdArray {

    @XmlElement(name = "client_item_id_row")
    protected List<ClientItemIdRow> clientItemIdRow;

    public List<ClientItemIdRow> getClientItemIdRow() {
        if (this.clientItemIdRow == null) {
            this.clientItemIdRow = new ArrayList<ClientItemIdRow>();
        }
        return this.clientItemIdRow;
    }

}
