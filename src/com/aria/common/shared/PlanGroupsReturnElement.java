package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_groups_ReturnElement", propOrder = {"planGroupNo", "planGroupName", "planGroupDesc", "planGroupUsage", "selectableInd", "clientPlanGroupId"})
public class PlanGroupsReturnElement {

    @XmlElement(name = "plan_group_no")
    protected Long planGroupNo;
    @XmlElement(name = "plan_group_name")
    protected String planGroupName;
    @XmlElement(name = "plan_group_desc")
    protected String planGroupDesc;
    @XmlElement(name = "plan_group_usage")
    protected String planGroupUsage;
    @XmlElement(name = "selectable_ind")
    protected Long selectableInd;
    @XmlElement(name = "client_plan_group_id")
    protected String clientPlanGroupId;
    
    public Long getPlanGroupNo() {
        return planGroupNo;
    }

    public void setPlanGroupNo(Long value) {
        this.planGroupNo = value;
    }

    public String getPlanGroupName() {
        return planGroupName;
    }

    public void setPlanGroupName(String value) {
        this.planGroupName = value;
    }

    public String getPlanGroupDesc() {
        return planGroupDesc;
    }

    public void setPlanGroupDesc(String value) {
        this.planGroupDesc = value;
    }

    public String getPlanGroupUsage() {
        return planGroupUsage;
    }

    public void setPlanGroupUsage(String value) {
        this.planGroupUsage = value;
    }

    public Long getSelectableInd() {
        return selectableInd;
    }

    public void setSelectableInd(Long value) {
        this.selectableInd = value;
    }

    public String getClientPlanGroupId() {
        return clientPlanGroupId;
    }

    public void setClientPlanGroupId(String value) {
        this.clientPlanGroupId = value;
    }

    
}
