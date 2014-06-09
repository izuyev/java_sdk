package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_no_to_remove_row", propOrder = {
    "queuedPlanNo",
    "queuedClientPlanId"
    })
public class PlanNoToRemoveRow {

    @XmlElement(name = "queued_plan_no")
    protected Long queuedPlanNo;
    @XmlElement(name = "queued_client_plan_id")
    protected String queuedClientPlanId;
    public Long getQueuedPlanNo() {
        return queuedPlanNo;
    }

    public void setQueuedPlanNo(Long value) {
        this.queuedPlanNo = value;
    }

    public String getQueuedClientPlanId() {
        return queuedClientPlanId;
    }

    public void setQueuedClientPlanId(String value) {
        this.queuedClientPlanId = value;
    }

    
}
