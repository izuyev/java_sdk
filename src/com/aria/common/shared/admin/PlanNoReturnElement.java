package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_no_ReturnElement", propOrder = {"planNos"})
public class PlanNoReturnElement {

    @XmlElement(name = "plan_nos")
    protected Long planNos;
    
    public Long getPlanNos() {
        return planNos;
    }

    public void setPlanNos(Long value) {
        this.planNos = value;
    }

    
}
