package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_service_types_row", propOrder = {
    "eligibleServiceTypes"
    })
public class EligibleServiceTypesRow {

    @XmlElement(name = "eligible_service_types")
    protected String eligibleServiceTypes;
    public String getEligibleServiceTypes() {
        return eligibleServiceTypes;
    }

    public void setEligibleServiceTypes(String value) {
        this.eligibleServiceTypes = value;
    }

    
}
