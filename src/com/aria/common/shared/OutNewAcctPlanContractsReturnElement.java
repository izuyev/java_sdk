package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "out_new_acct_plan_contracts_ReturnElement", propOrder = {"outContractNo", "outContractPlanNo"})
public class OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "out_contract_no")
    protected Long outContractNo;
    @XmlElement(name = "out_contract_plan_no")
    protected Long outContractPlanNo;
    
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

    
}
