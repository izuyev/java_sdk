package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_record_ids_array", propOrder = {
    "clientRecordIdsRow"
})
public class ClientRecordIdsArray {

    @XmlElement(name = "client_record_ids_row")
    protected List<ClientRecordIdsRow> clientRecordIdsRow;

    public List<ClientRecordIdsRow> getClientRecordIdsRow() {
        if (this.clientRecordIdsRow == null) {
            this.clientRecordIdsRow = new ArrayList<ClientRecordIdsRow>();
        }
        return this.clientRecordIdsRow;
    }

}
