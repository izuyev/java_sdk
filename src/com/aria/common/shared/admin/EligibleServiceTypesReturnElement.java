package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eligible_service_types_ReturnElement", propOrder = {"eligibleServiceType"})
public class EligibleServiceTypesReturnElement {

    @XmlElement(name = "eligible_service_type")
    protected String eligibleServiceType;
    
    public String getEligibleServiceType() {
        return eligibleServiceType;
    }

    public void setEligibleServiceType(String value) {
        this.eligibleServiceType = value;
    }

    
}
