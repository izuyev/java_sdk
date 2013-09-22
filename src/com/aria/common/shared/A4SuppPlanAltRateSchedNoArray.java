package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_supp_plan_alt_rate_sched_no_array", propOrder = {
    "a4SuppPlanAltRateSchedNoRow"
})
public class A4SuppPlanAltRateSchedNoArray {

    @XmlElement(name = "a4_supp_plan_alt_rate_sched_no_row")
    protected List<A4SuppPlanAltRateSchedNoRow> a4SuppPlanAltRateSchedNoRow;

    public List<A4SuppPlanAltRateSchedNoRow> getA4SuppPlanAltRateSchedNoRow() {
        if (this.a4SuppPlanAltRateSchedNoRow == null) {
            this.a4SuppPlanAltRateSchedNoRow = new ArrayList<A4SuppPlanAltRateSchedNoRow>();
        }
        return this.a4SuppPlanAltRateSchedNoRow;
    }

}
