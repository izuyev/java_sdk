package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_service_types_row", propOrder = {
    "eligibleServiceType"
    })
public class EligibleServiceTypesRow {

    @XmlElement(name = "eligible_service_type")
    protected String eligibleServiceType;
    public String getEligibleServiceType() {
        return eligibleServiceType;
    }

    public void setEligibleServiceType(String value) {
        this.eligibleServiceType = value;
    }

    
}
