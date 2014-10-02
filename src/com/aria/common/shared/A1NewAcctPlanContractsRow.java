package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_new_acct_plan_contracts_row", propOrder = {
    "a1ContractPlanNo",
    "a1ContractTypeNo",
    "a1ContractAltRecurFee",
    "a1ContractLengthMonths",
    "a1ContractCancelFee",
    "a1ContractComments",
    "a1ContractStartDate",
    "a1ContractEndDate",
    "a1ClientContractPlanId"
    })
public class A1NewAcctPlanContractsRow {

    @XmlElement(name = "a1_contract_plan_no")
    protected Long a1ContractPlanNo;
    @XmlElement(name = "a1_contract_type_no")
    protected Long a1ContractTypeNo;
    @XmlElement(name = "a1_contract_alt_recur_fee")
    protected Double a1ContractAltRecurFee;
    @XmlElement(name = "a1_contract_length_months")
    protected Long a1ContractLengthMonths;
    @XmlElement(name = "a1_contract_cancel_fee")
    protected Double a1ContractCancelFee;
    @XmlElement(name = "a1_contract_comments")
    protected String a1ContractComments;
    @XmlElement(name = "a1_contract_start_date")
    protected String a1ContractStartDate;
    @XmlElement(name = "a1_contract_end_date")
    protected String a1ContractEndDate;
    @XmlElement(name = "a1_client_contract_plan_id")
    protected String a1ClientContractPlanId;
    public Long getA1ContractPlanNo() {
        return a1ContractPlanNo;
    }

    public void setA1ContractPlanNo(Long value) {
        this.a1ContractPlanNo = value;
    }

    public Long getA1ContractTypeNo() {
        return a1ContractTypeNo;
    }

    public void setA1ContractTypeNo(Long value) {
        this.a1ContractTypeNo = value;
    }

    public Double getA1ContractAltRecurFee() {
        return a1ContractAltRecurFee;
    }

    public void setA1ContractAltRecurFee(Double value) {
        this.a1ContractAltRecurFee = value;
    }

    public Long getA1ContractLengthMonths() {
        return a1ContractLengthMonths;
    }

    public void setA1ContractLengthMonths(Long value) {
        this.a1ContractLengthMonths = value;
    }

    public Double getA1ContractCancelFee() {
        return a1ContractCancelFee;
    }

    public void setA1ContractCancelFee(Double value) {
        this.a1ContractCancelFee = value;
    }

    public String getA1ContractComments() {
        return a1ContractComments;
    }

    public void setA1ContractComments(String value) {
        this.a1ContractComments = value;
    }

    public String getA1ContractStartDate() {
        return a1ContractStartDate;
    }

    public void setA1ContractStartDate(String value) {
        this.a1ContractStartDate = value;
    }

    public String getA1ContractEndDate() {
        return a1ContractEndDate;
    }

    public void setA1ContractEndDate(String value) {
        this.a1ContractEndDate = value;
    }

    public String getA1ClientContractPlanId() {
        return a1ClientContractPlanId;
    }

    public void setA1ClientContractPlanId(String value) {
        this.a1ClientContractPlanId = value;
    }

    
}
