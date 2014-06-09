package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_client_supp_plan_ids_array", propOrder = {
    "a2ClientSuppPlanIdsRow"
})
public class A2ClientSuppPlanIdsArray {

    @XmlElement(name = "a2_client_supp_plan_ids_row")
    protected List<A2ClientSuppPlanIdsRow> a2ClientSuppPlanIdsRow;

    public List<A2ClientSuppPlanIdsRow> getA2ClientSuppPlanIdsRow() {
        if (this.a2ClientSuppPlanIdsRow == null) {
            this.a2ClientSuppPlanIdsRow = new ArrayList<A2ClientSuppPlanIdsRow>();
        }
        return this.a2ClientSuppPlanIdsRow;
    }

}
