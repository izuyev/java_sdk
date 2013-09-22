package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_supp_plan_alt_rate_sched_no_array", propOrder = {
    "a3SuppPlanAltRateSchedNoRow"
})
public class A3SuppPlanAltRateSchedNoArray {

    @XmlElement(name = "a3_supp_plan_alt_rate_sched_no_row")
    protected List<A3SuppPlanAltRateSchedNoRow> a3SuppPlanAltRateSchedNoRow;

    public List<A3SuppPlanAltRateSchedNoRow> getA3SuppPlanAltRateSchedNoRow() {
        if (this.a3SuppPlanAltRateSchedNoRow == null) {
            this.a3SuppPlanAltRateSchedNoRow = new ArrayList<A3SuppPlanAltRateSchedNoRow>();
        }
        return this.a3SuppPlanAltRateSchedNoRow;
    }

}
