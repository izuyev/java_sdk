package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_new_acct_plan_contracts_row", propOrder = {
    "a5ContractPlanNo",
    "a5ContractTypeNo",
    "a5ContractAltRecurFee",
    "a5ContractLengthMonths",
    "a5ContractCancelFee",
    "a5ContractComments",
    "a5ContractStartDate",
    "a5ContractEndDate",
    "a5ClientContractPlanId"
    })
public class A5NewAcctPlanContractsRow {

    @XmlElement(name = "a5_contract_plan_no")
    protected Long a5ContractPlanNo;
    @XmlElement(name = "a5_contract_type_no")
    protected Long a5ContractTypeNo;
    @XmlElement(name = "a5_contract_alt_recur_fee")
    protected Double a5ContractAltRecurFee;
    @XmlElement(name = "a5_contract_length_months")
    protected Long a5ContractLengthMonths;
    @XmlElement(name = "a5_contract_cancel_fee")
    protected Double a5ContractCancelFee;
    @XmlElement(name = "a5_contract_comments")
    protected String a5ContractComments;
    @XmlElement(name = "a5_contract_start_date")
    protected String a5ContractStartDate;
    @XmlElement(name = "a5_contract_end_date")
    protected String a5ContractEndDate;
    @XmlElement(name = "a5_client_contract_plan_id")
    protected String a5ClientContractPlanId;
    public Long getA5ContractPlanNo() {
        return a5ContractPlanNo;
    }

    public void setA5ContractPlanNo(Long value) {
        this.a5ContractPlanNo = value;
    }

    public Long getA5ContractTypeNo() {
        return a5ContractTypeNo;
    }

    public void setA5ContractTypeNo(Long value) {
        this.a5ContractTypeNo = value;
    }

    public Double getA5ContractAltRecurFee() {
        return a5ContractAltRecurFee;
    }

    public void setA5ContractAltRecurFee(Double value) {
        this.a5ContractAltRecurFee = value;
    }

    public Long getA5ContractLengthMonths() {
        return a5ContractLengthMonths;
    }

    public void setA5ContractLengthMonths(Long value) {
        this.a5ContractLengthMonths = value;
    }

    public Double getA5ContractCancelFee() {
        return a5ContractCancelFee;
    }

    public void setA5ContractCancelFee(Double value) {
        this.a5ContractCancelFee = value;
    }

    public String getA5ContractComments() {
        return a5ContractComments;
    }

    public void setA5ContractComments(String value) {
        this.a5ContractComments = value;
    }

    public String getA5ContractStartDate() {
        return a5ContractStartDate;
    }

    public void setA5ContractStartDate(String value) {
        this.a5ContractStartDate = value;
    }

    public String getA5ContractEndDate() {
        return a5ContractEndDate;
    }

    public void setA5ContractEndDate(String value) {
        this.a5ContractEndDate = value;
    }

    public String getA5ClientContractPlanId() {
        return a5ClientContractPlanId;
    }

    public void setA5ClientContractPlanId(String value) {
        this.a5ClientContractPlanId = value;
    }

    
}
