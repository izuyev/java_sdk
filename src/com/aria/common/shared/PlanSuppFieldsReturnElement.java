package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_supp_fields_ReturnElement", propOrder = {"planSuppFieldNo", "planSuppFieldName", "planSuppFieldDesc", "planSuppFieldValue"})
public class PlanSuppFieldsReturnElement {

    @XmlElement(name = "plan_supp_field_no")
    protected Long planSuppFieldNo;
    @XmlElement(name = "plan_supp_field_name")
    protected String planSuppFieldName;
    @XmlElement(name = "plan_supp_field_desc")
    protected String planSuppFieldDesc;
    @XmlElement(name = "plan_supp_field_value")
    protected String planSuppFieldValue;
    
    public Long getPlanSuppFieldNo() {
        return planSuppFieldNo;
    }

    public void setPlanSuppFieldNo(Long value) {
        this.planSuppFieldNo = value;
    }

    public String getPlanSuppFieldName() {
        return planSuppFieldName;
    }

    public void setPlanSuppFieldName(String value) {
        this.planSuppFieldName = value;
    }

    public String getPlanSuppFieldDesc() {
        return planSuppFieldDesc;
    }

    public void setPlanSuppFieldDesc(String value) {
        this.planSuppFieldDesc = value;
    }

    public String getPlanSuppFieldValue() {
        return planSuppFieldValue;
    }

    public void setPlanSuppFieldValue(String value) {
        this.planSuppFieldValue = value;
    }

    
}
