package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pre_calc_plan_row", propOrder = {
    "planItemServiceNo",
    "planItemPlanNo",
    "planItemUnits",
    "planItemUnitAmount",
    "clientPlanItemServiceId",
    "clientPlanItemPlanId"
    })
public class PreCalcPlanRow {

    @XmlElement(name = "plan_item_service_no")
    protected Long planItemServiceNo;
    @XmlElement(name = "plan_item_plan_no")
    protected Long planItemPlanNo;
    @XmlElement(name = "plan_item_units")
    protected Double planItemUnits;
    @XmlElement(name = "plan_item_unit_amount")
    protected Double planItemUnitAmount;
    @XmlElement(name = "client_plan_item_service_id")
    protected String clientPlanItemServiceId;
    @XmlElement(name = "client_plan_item_plan_id")
    protected String clientPlanItemPlanId;
    public Long getPlanItemServiceNo() {
        return planItemServiceNo;
    }

    public void setPlanItemServiceNo(Long value) {
        this.planItemServiceNo = value;
    }

    public Long getPlanItemPlanNo() {
        return planItemPlanNo;
    }

    public void setPlanItemPlanNo(Long value) {
        this.planItemPlanNo = value;
    }

    public Double getPlanItemUnits() {
        return planItemUnits;
    }

    public void setPlanItemUnits(Double value) {
        this.planItemUnits = value;
    }

    public Double getPlanItemUnitAmount() {
        return planItemUnitAmount;
    }

    public void setPlanItemUnitAmount(Double value) {
        this.planItemUnitAmount = value;
    }

    public String getClientPlanItemServiceId() {
        return clientPlanItemServiceId;
    }

    public void setClientPlanItemServiceId(String value) {
        this.clientPlanItemServiceId = value;
    }

    public String getClientPlanItemPlanId() {
        return clientPlanItemPlanId;
    }

    public void setClientPlanItemPlanId(String value) {
        this.clientPlanItemPlanId = value;
    }

    
}
