package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supp_plans_to_assign_row", propOrder = {
    "suppPlanNo",
    "altRateScheduleNo",
    "numPlanUnits",
    "contractTypeNo",
    "contractAltRecurFee",
    "contractLengthMonths",
    "contractCancelFee",
    "contractComments",
    "contractStartDate",
    "offsetMonths",
    "autoOffsetMonthsOption",
    "offsetInterval",
    "contractEndDate"
    })
public class SuppPlansToAssignRow {

    @XmlElement(name = "supp_plan_no")
    protected Long suppPlanNo;
    @XmlElement(name = "alt_rate_schedule_no")
    protected Long altRateScheduleNo;
    @XmlElement(name = "num_plan_units")
    protected Long numPlanUnits;
    @XmlElement(name = "contract_type_no")
    protected Long contractTypeNo;
    @XmlElement(name = "contract_alt_recur_fee")
    protected Double contractAltRecurFee;
    @XmlElement(name = "contract_length_months")
    protected Long contractLengthMonths;
    @XmlElement(name = "contract_cancel_fee")
    protected Double contractCancelFee;
    @XmlElement(name = "contract_comments")
    protected String contractComments;
    @XmlElement(name = "contract_start_date")
    protected String contractStartDate;
    @XmlElement(name = "offset_months")
    protected Long offsetMonths;
    @XmlElement(name = "auto_offset_months_option")
    protected Long autoOffsetMonthsOption;
    @XmlElement(name = "offset_interval")
    protected Long offsetInterval;
    @XmlElement(name = "contract_end_date")
    protected String contractEndDate;
    public Long getSuppPlanNo() {
        return suppPlanNo;
    }

    public void setSuppPlanNo(Long value) {
        this.suppPlanNo = value;
    }

    public Long getAltRateScheduleNo() {
        return altRateScheduleNo;
    }

    public void setAltRateScheduleNo(Long value) {
        this.altRateScheduleNo = value;
    }

    public Long getNumPlanUnits() {
        return numPlanUnits;
    }

    public void setNumPlanUnits(Long value) {
        this.numPlanUnits = value;
    }

    public Long getContractTypeNo() {
        return contractTypeNo;
    }

    public void setContractTypeNo(Long value) {
        this.contractTypeNo = value;
    }

    public Double getContractAltRecurFee() {
        return contractAltRecurFee;
    }

    public void setContractAltRecurFee(Double value) {
        this.contractAltRecurFee = value;
    }

    public Long getContractLengthMonths() {
        return contractLengthMonths;
    }

    public void setContractLengthMonths(Long value) {
        this.contractLengthMonths = value;
    }

    public Double getContractCancelFee() {
        return contractCancelFee;
    }

    public void setContractCancelFee(Double value) {
        this.contractCancelFee = value;
    }

    public String getContractComments() {
        return contractComments;
    }

    public void setContractComments(String value) {
        this.contractComments = value;
    }

    public String getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(String value) {
        this.contractStartDate = value;
    }

    public Long getOffsetMonths() {
        return offsetMonths;
    }

    public void setOffsetMonths(Long value) {
        this.offsetMonths = value;
    }

    public Long getAutoOffsetMonthsOption() {
        return autoOffsetMonthsOption;
    }

    public void setAutoOffsetMonthsOption(Long value) {
        this.autoOffsetMonthsOption = value;
    }

    public Long getOffsetInterval() {
        return offsetInterval;
    }

    public void setOffsetInterval(Long value) {
        this.offsetInterval = value;
    }

    public String getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(String value) {
        this.contractEndDate = value;
    }

    
}
