package com.aria.common.shared.admin;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parent_client_plan_ids_row", propOrder = {
    "parentClientPlanId"
    })
public class ParentClientPlanIdsRow {

    @XmlElement(name = "parent_client_plan_id")
    protected Long parentClientPlanId;
    public Long getParentClientPlanId() {
        return parentClientPlanId;
    }

    public void setParentClientPlanId(Long value) {
        this.parentClientPlanId = value;
    }

    
}
