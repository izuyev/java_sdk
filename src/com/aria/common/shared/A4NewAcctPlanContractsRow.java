package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_new_acct_plan_contracts_row", propOrder = {
    "a4ContractPlanNo",
    "a4ContractTypeNo",
    "a4ContractAltRecurFee",
    "a4ContractLengthMonths",
    "a4ContractCancelFee",
    "a4ContractComments",
    "a4ContractStartDate",
    "a4ContractEndDate"
    })
public class A4NewAcctPlanContractsRow {

    @XmlElement(name = "a4_contract_plan_no")
    protected Long a4ContractPlanNo;
    @XmlElement(name = "a4_contract_type_no")
    protected Long a4ContractTypeNo;
    @XmlElement(name = "a4_contract_alt_recur_fee")
    protected Double a4ContractAltRecurFee;
    @XmlElement(name = "a4_contract_length_months")
    protected Long a4ContractLengthMonths;
    @XmlElement(name = "a4_contract_cancel_fee")
    protected Double a4ContractCancelFee;
    @XmlElement(name = "a4_contract_comments")
    protected String a4ContractComments;
    @XmlElement(name = "a4_contract_start_date")
    protected String a4ContractStartDate;
    @XmlElement(name = "a4_contract_end_date")
    protected String a4ContractEndDate;
    public Long getA4ContractPlanNo() {
        return a4ContractPlanNo;
    }

    public void setA4ContractPlanNo(Long value) {
        this.a4ContractPlanNo = value;
    }

    public Long getA4ContractTypeNo() {
        return a4ContractTypeNo;
    }

    public void setA4ContractTypeNo(Long value) {
        this.a4ContractTypeNo = value;
    }

    public Double getA4ContractAltRecurFee() {
        return a4ContractAltRecurFee;
    }

    public void setA4ContractAltRecurFee(Double value) {
        this.a4ContractAltRecurFee = value;
    }

    public Long getA4ContractLengthMonths() {
        return a4ContractLengthMonths;
    }

    public void setA4ContractLengthMonths(Long value) {
        this.a4ContractLengthMonths = value;
    }

    public Double getA4ContractCancelFee() {
        return a4ContractCancelFee;
    }

    public void setA4ContractCancelFee(Double value) {
        this.a4ContractCancelFee = value;
    }

    public String getA4ContractComments() {
        return a4ContractComments;
    }

    public void setA4ContractComments(String value) {
        this.a4ContractComments = value;
    }

    public String getA4ContractStartDate() {
        return a4ContractStartDate;
    }

    public void setA4ContractStartDate(String value) {
        this.a4ContractStartDate = value;
    }

    public String getA4ContractEndDate() {
        return a4ContractEndDate;
    }

    public void setA4ContractEndDate(String value) {
        this.a4ContractEndDate = value;
    }

    
}
