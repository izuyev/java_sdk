package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_plan_id_array", propOrder = {
    "clientPlanIdRow"
})
public class ClientPlanIdArray {

    @XmlElement(name = "client_plan_id_row")
    protected List<ClientPlanIdRow> clientPlanIdRow;

    public List<ClientPlanIdRow> getClientPlanIdRow() {
        if (this.clientPlanIdRow == null) {
            this.clientPlanIdRow = new ArrayList<ClientPlanIdRow>();
        }
        return this.clientPlanIdRow;
    }

}
