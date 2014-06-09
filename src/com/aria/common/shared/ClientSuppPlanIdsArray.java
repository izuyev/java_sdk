package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client_supp_plan_ids_array", propOrder = {
    "clientSuppPlanIdsRow"
})
public class ClientSuppPlanIdsArray {

    @XmlElement(name = "client_supp_plan_ids_row")
    protected List<ClientSuppPlanIdsRow> clientSuppPlanIdsRow;

    public List<ClientSuppPlanIdsRow> getClientSuppPlanIdsRow() {
        if (this.clientSuppPlanIdsRow == null) {
            this.clientSuppPlanIdsRow = new ArrayList<ClientSuppPlanIdsRow>();
        }
        return this.clientSuppPlanIdsRow;
    }

}
