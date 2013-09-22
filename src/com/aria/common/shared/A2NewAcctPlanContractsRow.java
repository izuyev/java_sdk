package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_new_acct_plan_contracts_row", propOrder = {
    "a2ContractPlanNo",
    "a2ContractTypeNo",
    "a2ContractAltRecurFee",
    "a2ContractLengthMonths",
    "a2ContractCancelFee",
    "a2ContractComments",
    "a2ContractStartDate",
    "a2ContractEndDate"
    })
public class A2NewAcctPlanContractsRow {

    @XmlElement(name = "a2_contract_plan_no")
    protected Long a2ContractPlanNo;
    @XmlElement(name = "a2_contract_type_no")
    protected Long a2ContractTypeNo;
    @XmlElement(name = "a2_contract_alt_recur_fee")
    protected Double a2ContractAltRecurFee;
    @XmlElement(name = "a2_contract_length_months")
    protected Long a2ContractLengthMonths;
    @XmlElement(name = "a2_contract_cancel_fee")
    protected Double a2ContractCancelFee;
    @XmlElement(name = "a2_contract_comments")
    protected String a2ContractComments;
    @XmlElement(name = "a2_contract_start_date")
    protected String a2ContractStartDate;
    @XmlElement(name = "a2_contract_end_date")
    protected String a2ContractEndDate;
    public Long getA2ContractPlanNo() {
        return a2ContractPlanNo;
    }

    public void setA2ContractPlanNo(Long value) {
        this.a2ContractPlanNo = value;
    }

    public Long getA2ContractTypeNo() {
        return a2ContractTypeNo;
    }

    public void setA2ContractTypeNo(Long value) {
        this.a2ContractTypeNo = value;
    }

    public Double getA2ContractAltRecurFee() {
        return a2ContractAltRecurFee;
    }

    public void setA2ContractAltRecurFee(Double value) {
        this.a2ContractAltRecurFee = value;
    }

    public Long getA2ContractLengthMonths() {
        return a2ContractLengthMonths;
    }

    public void setA2ContractLengthMonths(Long value) {
        this.a2ContractLengthMonths = value;
    }

    public Double getA2ContractCancelFee() {
        return a2ContractCancelFee;
    }

    public void setA2ContractCancelFee(Double value) {
        this.a2ContractCancelFee = value;
    }

    public String getA2ContractComments() {
        return a2ContractComments;
    }

    public void setA2ContractComments(String value) {
        this.a2ContractComments = value;
    }

    public String getA2ContractStartDate() {
        return a2ContractStartDate;
    }

    public void setA2ContractStartDate(String value) {
        this.a2ContractStartDate = value;
    }

    public String getA2ContractEndDate() {
        return a2ContractEndDate;
    }

    public void setA2ContractEndDate(String value) {
        this.a2ContractEndDate = value;
    }

    
}
