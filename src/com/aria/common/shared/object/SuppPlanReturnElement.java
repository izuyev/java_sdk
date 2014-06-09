package com.aria.common.shared.object;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_ReturnElement", propOrder = {"suppPlanNo", "suppPlanName"})
public class SuppPlanReturnElement {

    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "supp_plan_name")
    protected String suppPlanName;
    
    public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }

    public String getSuppPlanName() {
        return suppPlanName;
    }

    public void setSuppPlanName(String value) {
        this.suppPlanName = value;
    }

    
}
