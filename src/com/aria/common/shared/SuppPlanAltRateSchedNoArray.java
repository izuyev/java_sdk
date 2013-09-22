package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_alt_rate_sched_no_array", propOrder = {
    "suppPlanAltRateSchedNoRow"
})
public class SuppPlanAltRateSchedNoArray {

    @XmlElement(name = "supp_plan_alt_rate_sched_no_row")
    protected List<SuppPlanAltRateSchedNoRow> suppPlanAltRateSchedNoRow;

    public List<SuppPlanAltRateSchedNoRow> getSuppPlanAltRateSchedNoRow() {
        if (this.suppPlanAltRateSchedNoRow == null) {
            this.suppPlanAltRateSchedNoRow = new ArrayList<SuppPlanAltRateSchedNoRow>();
        }
        return this.suppPlanAltRateSchedNoRow;
    }

}
