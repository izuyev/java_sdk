package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_service_types_array", propOrder = {
    "eligibleServiceTypesRow"
})
public class EligibleServiceTypesArray {

    @XmlElement(name = "eligible_service_types_row")
    protected List<EligibleServiceTypesRow> eligibleServiceTypesRow;

    public List<EligibleServiceTypesRow> getEligibleServiceTypesRow() {
        if (this.eligibleServiceTypesRow == null) {
            this.eligibleServiceTypesRow = new ArrayList<EligibleServiceTypesRow>();
        }
        return this.eligibleServiceTypesRow;
    }

}
