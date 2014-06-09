package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a3_out_new_acct_plan_contracts_ReturnElement", propOrder = {"a3OutContractNo", "a3OutContractPlanNo", "a3OutClientContractPlanId"})
public class A3OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "a3_out_contract_no")
    protected Long a3OutContractNo;
    @XmlElement(name = "a3_out_contract_plan_no")
    protected Long a3OutContractPlanNo;
    @XmlElement(name = "a3_out_client_contract_plan_id")
    protected String a3OutClientContractPlanId;
    
    public Long getA3OutContractNo() {
        return a3OutContractNo;
    }

    public void setA3OutContractNo(Long value) {
        this.a3OutContractNo = value;
    }

    public Long getA3OutContractPlanNo() {
        return a3OutContractPlanNo;
    }

    public void setA3OutContractPlanNo(Long value) {
        this.a3OutContractPlanNo = value;
    }

    public String getA3OutClientContractPlanId() {
        return a3OutClientContractPlanId;
    }

    public void setA3OutClientContractPlanId(String value) {
        this.a3OutClientContractPlanId = value;
    }

    
}
