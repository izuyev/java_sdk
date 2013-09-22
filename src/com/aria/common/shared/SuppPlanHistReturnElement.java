package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plan_hist_ReturnElement", propOrder = {"suppPlanNo", "oldStatusCd", "newStatusCd", "oldPlanUnits", "newPlanUnits", "oldScheduleNo", "newScheduleNo", "comments", "updateDate"})
public class SuppPlanHistReturnElement {

    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "old_status_cd")
    protected Long oldStatusCd;
    @XmlElement(name = "new_status_cd")
    protected Long newStatusCd;
    @XmlElement(name = "old_plan_units")
    protected Double oldPlanUnits;
    @XmlElement(name = "new_plan_units")
    protected Double newPlanUnits;
    @XmlElement(name = "old_schedule_no")
    protected Long oldScheduleNo;
    @XmlElement(name = "new_schedule_no")
    protected Long newScheduleNo;
    @XmlElement(name = "comments")
    protected String comments;
    @XmlElement(name = "update_date")
    protected String updateDate;
    
    public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }

    public Long getOldStatusCd() {
        return oldStatusCd;
    }

    public void setOldStatusCd(Long value) {
        this.oldStatusCd = value;
    }

    public Long getNewStatusCd() {
        return newStatusCd;
    }

    public void setNewStatusCd(Long value) {
        this.newStatusCd = value;
    }

    public Double getOldPlanUnits() {
        return oldPlanUnits;
    }

    public void setOldPlanUnits(Double value) {
        this.oldPlanUnits = value;
    }

    public Double getNewPlanUnits() {
        return newPlanUnits;
    }

    public void setNewPlanUnits(Double value) {
        this.newPlanUnits = value;
    }

    public Long getOldScheduleNo() {
        return oldScheduleNo;
    }

    public void setOldScheduleNo(Long value) {
        this.oldScheduleNo = value;
    }

    public Long getNewScheduleNo() {
        return newScheduleNo;
    }

    public void setNewScheduleNo(Long value) {
        this.newScheduleNo = value;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String value) {
        this.comments = value;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String value) {
        this.updateDate = value;
    }

    
}
