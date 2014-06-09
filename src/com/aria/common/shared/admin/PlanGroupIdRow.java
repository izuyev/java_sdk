package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_group_id_row", propOrder = {
    "planGroupId"
    })
public class PlanGroupIdRow {

    @XmlElement(name = "plan_group_id")
    protected String planGroupId;
    public String getPlanGroupId() {
        return planGroupId;
    }

    public void setPlanGroupId(String value) {
        this.planGroupId = value;
    }

    
}
