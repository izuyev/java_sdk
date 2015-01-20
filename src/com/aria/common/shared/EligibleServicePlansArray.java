package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_service_plans_array", propOrder = {
    "eligibleServicePlansRow"
})
public class EligibleServicePlansArray {

    @XmlElement(name = "eligible_service_plans_row")
    protected List<EligibleServicePlansRow> eligibleServicePlansRow;

    public List<EligibleServicePlansRow> getEligibleServicePlansRow() {
        if (this.eligibleServicePlansRow == null) {
            this.eligibleServicePlansRow = new ArrayList<EligibleServicePlansRow>();
        }
        return this.eligibleServicePlansRow;
    }

}
