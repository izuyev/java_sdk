package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre_calc_plan_array", propOrder = {
    "preCalcPlanRow"
})
public class PreCalcPlanArray {

    @XmlElement(name = "pre_calc_plan_row")
    protected List<PreCalcPlanRow> preCalcPlanRow;

    public List<PreCalcPlanRow> getPreCalcPlanRow() {
        if (this.preCalcPlanRow == null) {
            this.preCalcPlanRow = new ArrayList<PreCalcPlanRow>();
        }
        return this.preCalcPlanRow;
    }

}
