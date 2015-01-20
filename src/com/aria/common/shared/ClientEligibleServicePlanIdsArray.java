package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_eligible_service_plan_ids_array", propOrder = {
    "clientEligibleServicePlanIdsRow"
})
public class ClientEligibleServicePlanIdsArray {

    @XmlElement(name = "client_eligible_service_plan_ids_row")
    protected List<ClientEligibleServicePlanIdsRow> clientEligibleServicePlanIdsRow;

    public List<ClientEligibleServicePlanIdsRow> getClientEligibleServicePlanIdsRow() {
        if (this.clientEligibleServicePlanIdsRow == null) {
            this.clientEligibleServicePlanIdsRow = new ArrayList<ClientEligibleServicePlanIdsRow>();
        }
        return this.clientEligibleServicePlanIdsRow;
    }

}
