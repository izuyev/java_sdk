package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_client_supp_plan_ids_array", propOrder = {
    "a1ClientSuppPlanIdsRow"
})
public class A1ClientSuppPlanIdsArray {

    @XmlElement(name = "a1_client_supp_plan_ids_row")
    protected List<A1ClientSuppPlanIdsRow> a1ClientSuppPlanIdsRow;

    public List<A1ClientSuppPlanIdsRow> getA1ClientSuppPlanIdsRow() {
        if (this.a1ClientSuppPlanIdsRow == null) {
            this.a1ClientSuppPlanIdsRow = new ArrayList<A1ClientSuppPlanIdsRow>();
        }
        return this.a1ClientSuppPlanIdsRow;
    }

}
