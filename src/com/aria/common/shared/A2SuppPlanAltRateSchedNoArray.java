package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_supp_plan_alt_rate_sched_no_array", propOrder = {
    "a2SuppPlanAltRateSchedNoRow"
})
public class A2SuppPlanAltRateSchedNoArray {

    @XmlElement(name = "a2_supp_plan_alt_rate_sched_no_row")
    protected List<A2SuppPlanAltRateSchedNoRow> a2SuppPlanAltRateSchedNoRow;

    public List<A2SuppPlanAltRateSchedNoRow> getA2SuppPlanAltRateSchedNoRow() {
        if (this.a2SuppPlanAltRateSchedNoRow == null) {
            this.a2SuppPlanAltRateSchedNoRow = new ArrayList<A2SuppPlanAltRateSchedNoRow>();
        }
        return this.a2SuppPlanAltRateSchedNoRow;
    }

}
