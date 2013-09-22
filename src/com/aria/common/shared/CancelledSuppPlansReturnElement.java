package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cancelled_supp_plans_ReturnElement", propOrder = {"suppPlanNo", "suppPlanName", "suppProrationResultAmount"})
public class CancelledSuppPlansReturnElement {

    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "supp_plan_name")
    protected String suppPlanName;
    @XmlElement(name = "supp_proration_result_amount")
    protected Double suppProrationResultAmount;
    
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

    public Double getSuppProrationResultAmount() {
        return suppProrationResultAmount;
    }

    public void setSuppProrationResultAmount(Double value) {
        this.suppProrationResultAmount = value;
    }

    
}
