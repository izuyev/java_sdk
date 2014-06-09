package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_client_supp_plan_ids_array", propOrder = {
    "a4ClientSuppPlanIdsRow"
})
public class A4ClientSuppPlanIdsArray {

    @XmlElement(name = "a4_client_supp_plan_ids_row")
    protected List<A4ClientSuppPlanIdsRow> a4ClientSuppPlanIdsRow;

    public List<A4ClientSuppPlanIdsRow> getA4ClientSuppPlanIdsRow() {
        if (this.a4ClientSuppPlanIdsRow == null) {
            this.a4ClientSuppPlanIdsRow = new ArrayList<A4ClientSuppPlanIdsRow>();
        }
        return this.a4ClientSuppPlanIdsRow;
    }

}
