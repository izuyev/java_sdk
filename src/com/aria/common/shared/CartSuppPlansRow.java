package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cart_supp_plans_row", propOrder = {
    "suppPlanNo",
    "suppPlanUnits",
    "assignmentDirective"
    })
public class CartSuppPlansRow {

    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "supp_plan_units")
    protected Long suppPlanUnits;
    @XmlElement(name = "assignment_directive")
    protected Long assignmentDirective;
    public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }

    public Long getSuppPlanUnits() {
        return suppPlanUnits;
    }

    public void setSuppPlanUnits(Long value) {
        this.suppPlanUnits = value;
    }

    public Long getAssignmentDirective() {
        return assignmentDirective;
    }

    public void setAssignmentDirective(Long value) {
        this.assignmentDirective = value;
    }

    
}
