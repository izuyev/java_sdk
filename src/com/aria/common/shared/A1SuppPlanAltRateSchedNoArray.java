package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_supp_plan_alt_rate_sched_no_array", propOrder = {
    "a1SuppPlanAltRateSchedNoRow"
})
public class A1SuppPlanAltRateSchedNoArray {

    @XmlElement(name = "a1_supp_plan_alt_rate_sched_no_row")
    protected List<A1SuppPlanAltRateSchedNoRow> a1SuppPlanAltRateSchedNoRow;

    public List<A1SuppPlanAltRateSchedNoRow> getA1SuppPlanAltRateSchedNoRow() {
        if (this.a1SuppPlanAltRateSchedNoRow == null) {
            this.a1SuppPlanAltRateSchedNoRow = new ArrayList<A1SuppPlanAltRateSchedNoRow>();
        }
        return this.a1SuppPlanAltRateSchedNoRow;
    }

}
