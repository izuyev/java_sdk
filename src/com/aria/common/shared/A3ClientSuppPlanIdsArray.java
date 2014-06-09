package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_client_supp_plan_ids_array", propOrder = {
    "a3ClientSuppPlanIdsRow"
})
public class A3ClientSuppPlanIdsArray {

    @XmlElement(name = "a3_client_supp_plan_ids_row")
    protected List<A3ClientSuppPlanIdsRow> a3ClientSuppPlanIdsRow;

    public List<A3ClientSuppPlanIdsRow> getA3ClientSuppPlanIdsRow() {
        if (this.a3ClientSuppPlanIdsRow == null) {
            this.a3ClientSuppPlanIdsRow = new ArrayList<A3ClientSuppPlanIdsRow>();
        }
        return this.a3ClientSuppPlanIdsRow;
    }

}
