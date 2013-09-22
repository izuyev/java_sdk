package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_new_acct_plan_contracts_row", propOrder = {
    "a3ContractPlanNo",
    "a3ContractTypeNo",
    "a3ContractAltRecurFee",
    "a3ContractLengthMonths",
    "a3ContractCancelFee",
    "a3ContractComments",
    "a3ContractStartDate",
    "a3ContractEndDate"
    })
public class A3NewAcctPlanContractsRow {

    @XmlElement(name = "a3_contract_plan_no")
    protected Long a3ContractPlanNo;
    @XmlElement(name = "a3_contract_type_no")
    protected Long a3ContractTypeNo;
    @XmlElement(name = "a3_contract_alt_recur_fee")
    protected Double a3ContractAltRecurFee;
    @XmlElement(name = "a3_contract_length_months")
    protected Long a3ContractLengthMonths;
    @XmlElement(name = "a3_contract_cancel_fee")
    protected Double a3ContractCancelFee;
    @XmlElement(name = "a3_contract_comments")
    protected String a3ContractComments;
    @XmlElement(name = "a3_contract_start_date")
    protected String a3ContractStartDate;
    @XmlElement(name = "a3_contract_end_date")
    protected String a3ContractEndDate;
    public Long getA3ContractPlanNo() {
        return a3ContractPlanNo;
    }

    public void setA3ContractPlanNo(Long value) {
        this.a3ContractPlanNo = value;
    }

    public Long getA3ContractTypeNo() {
        return a3ContractTypeNo;
    }

    public void setA3ContractTypeNo(Long value) {
        this.a3ContractTypeNo = value;
    }

    public Double getA3ContractAltRecurFee() {
        return a3ContractAltRecurFee;
    }

    public void setA3ContractAltRecurFee(Double value) {
        this.a3ContractAltRecurFee = value;
    }

    public Long getA3ContractLengthMonths() {
        return a3ContractLengthMonths;
    }

    public void setA3ContractLengthMonths(Long value) {
        this.a3ContractLengthMonths = value;
    }

    public Double getA3ContractCancelFee() {
        return a3ContractCancelFee;
    }

    public void setA3ContractCancelFee(Double value) {
        this.a3ContractCancelFee = value;
    }

    public String getA3ContractComments() {
        return a3ContractComments;
    }

    public void setA3ContractComments(String value) {
        this.a3ContractComments = value;
    }

    public String getA3ContractStartDate() {
        return a3ContractStartDate;
    }

    public void setA3ContractStartDate(String value) {
        this.a3ContractStartDate = value;
    }

    public String getA3ContractEndDate() {
        return a3ContractEndDate;
    }

    public void setA3ContractEndDate(String value) {
        this.a3ContractEndDate = value;
    }

    
}
