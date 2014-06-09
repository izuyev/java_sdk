package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_client_supp_plan_ids_array", propOrder = {
    "a5ClientSuppPlanIdsRow"
})
public class A5ClientSuppPlanIdsArray {

    @XmlElement(name = "a5_client_supp_plan_ids_row")
    protected List<A5ClientSuppPlanIdsRow> a5ClientSuppPlanIdsRow;

    public List<A5ClientSuppPlanIdsRow> getA5ClientSuppPlanIdsRow() {
        if (this.a5ClientSuppPlanIdsRow == null) {
            this.a5ClientSuppPlanIdsRow = new ArrayList<A5ClientSuppPlanIdsRow>();
        }
        return this.a5ClientSuppPlanIdsRow;
    }

}
