package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a4_out_new_acct_plan_contracts_ReturnElement", propOrder = {"a4OutContractNo", "a4OutContractPlanNo", "a4OutClientContractPlanId"})
public class A4OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "a4_out_contract_no")
    protected Long a4OutContractNo;
    @XmlElement(name = "a4_out_contract_plan_no")
    protected Long a4OutContractPlanNo;
    @XmlElement(name = "a4_out_client_contract_plan_id")
    protected String a4OutClientContractPlanId;
    
    public Long getA4OutContractNo() {
        return a4OutContractNo;
    }

    public void setA4OutContractNo(Long value) {
        this.a4OutContractNo = value;
    }

    public Long getA4OutContractPlanNo() {
        return a4OutContractPlanNo;
    }

    public void setA4OutContractPlanNo(Long value) {
        this.a4OutContractPlanNo = value;
    }

    public String getA4OutClientContractPlanId() {
        return a4OutClientContractPlanId;
    }

    public void setA4OutClientContractPlanId(String value) {
        this.a4OutClientContractPlanId = value;
    }

    
}
