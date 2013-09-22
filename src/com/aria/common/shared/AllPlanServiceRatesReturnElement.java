package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "all_plan_service_rates_ReturnElement", propOrder = {"scheduleNo", "planServiceRates"})
public class AllPlanServiceRatesReturnElement {

    @XmlElement(name = "schedule_no")
    protected Long scheduleNo;
    @XmlElement(name = "plan_service_rates")
    protected List<PlanServiceRatesReturnElement> planServiceRates;
    
    public Long getScheduleNo() {
        return scheduleNo;
    }

    public void setScheduleNo(Long value) {
        this.scheduleNo = value;
    }

    public List<PlanServiceRatesReturnElement> getPlanServiceRates() {
        if (this.planServiceRates == null) {
            this.planServiceRates = new ArrayList<PlanServiceRatesReturnElement>();
        }
        return this.planServiceRates;
    }
}
