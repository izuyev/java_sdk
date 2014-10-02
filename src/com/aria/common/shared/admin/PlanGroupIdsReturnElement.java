package com.aria.common.shared.admin;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_ids_ReturnElement", propOrder = {"planGroupId"})
public class PlanGroupIdsReturnElement {

    @XmlElement(name = "plan_group_id")
    protected Long planGroupId;
    
    public Long getPlanGroupId() {
        return planGroupId;
    }

    public void setPlanGroupId(Long value) {
        this.planGroupId = value;
    }

    
}
