package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_no_to_remove_row", propOrder = {
    "queuedPlanNo"
    })
public class PlanNoToRemoveRow {

    @XmlElement(name = "queued_plan_no")
    protected Long queuedPlanNo;
    public Long getQueuedPlanNo() {
        return queuedPlanNo;
    }

    public void setQueuedPlanNo(Long value) {
        this.queuedPlanNo = value;
    }

    
}
