package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_supp_plan_alt_rate_sched_no_array", propOrder = {
    "a5SuppPlanAltRateSchedNoRow"
})
public class A5SuppPlanAltRateSchedNoArray {

    @XmlElement(name = "a5_supp_plan_alt_rate_sched_no_row")
    protected List<A5SuppPlanAltRateSchedNoRow> a5SuppPlanAltRateSchedNoRow;

    public List<A5SuppPlanAltRateSchedNoRow> getA5SuppPlanAltRateSchedNoRow() {
        if (this.a5SuppPlanAltRateSchedNoRow == null) {
            this.a5SuppPlanAltRateSchedNoRow = new ArrayList<A5SuppPlanAltRateSchedNoRow>();
        }
        return this.a5SuppPlanAltRateSchedNoRow;
    }

}
