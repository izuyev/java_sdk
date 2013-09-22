package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "plan_hist_ReturnElement", propOrder = {"startDate", "endDate", "planName", "newPlan", "clientReceiptId", "planUnits"})
public class PlanHistReturnElement {

    @XmlElement(name = "start_date")
    protected String startDate;
    @XmlElement(name = "end_date")
    protected String endDate;
    @XmlElement(name = "plan_name")
    protected String planName;
    @XmlElement(name = "new_plan")
    protected String newPlan;
    @XmlElement(name = "client_receipt_id")
    protected String clientReceiptId;
    @XmlElement(name = "plan_units")
    protected Double planUnits;
    
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String value) {
        this.startDate = value;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String value) {
        this.endDate = value;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String value) {
        this.planName = value;
    }

    public String getNewPlan() {
        return newPlan;
    }

    public void setNewPlan(String value) {
        this.newPlan = value;
    }

    public String getClientReceiptId() {
        return clientReceiptId;
    }

    public void setClientReceiptId(String value) {
        this.clientReceiptId = value;
    }

    public Double getPlanUnits() {
        return planUnits;
    }

    public void setPlanUnits(Double value) {
        this.planUnits = value;
    }

    
}
