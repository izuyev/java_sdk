package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plan_ids_to_get_outage_array", propOrder = {
    "clientPlanIdsToGetOutageRow"
})
public class ClientPlanIdsToGetOutageArray {

    @XmlElement(name = "client_plan_ids_to_get_outage_row")
    protected List<ClientPlanIdsToGetOutageRow> clientPlanIdsToGetOutageRow;

    public List<ClientPlanIdsToGetOutageRow> getClientPlanIdsToGetOutageRow() {
        if (this.clientPlanIdsToGetOutageRow == null) {
            this.clientPlanIdsToGetOutageRow = new ArrayList<ClientPlanIdsToGetOutageRow>();
        }
        return this.clientPlanIdsToGetOutageRow;
    }

}
