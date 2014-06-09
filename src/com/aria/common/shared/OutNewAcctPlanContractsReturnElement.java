package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "out_new_acct_plan_contracts_ReturnElement", propOrder = {"outContractNo", "outContractPlanNo", "outClientContractPlanId"})
public class OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "out_contract_no")
    protected Long outContractNo;
    @XmlElement(name = "out_contract_plan_no")
    protected Long outContractPlanNo;
    @XmlElement(name = "out_client_contract_plan_id")
    protected String outClientContractPlanId;
    
    public Long getOutContractNo() {
        return outContractNo;
    }

    public void setOutContractNo(Long value) {
        this.outContractNo = value;
    }

    public Long getOutContractPlanNo() {
        return outContractPlanNo;
    }

    public void setOutContractPlanNo(Long value) {
        this.outContractPlanNo = value;
    }

    public String getOutClientContractPlanId() {
        return outClientContractPlanId;
    }

    public void setOutClientContractPlanId(String value) {
        this.outClientContractPlanId = value;
    }

    
}
