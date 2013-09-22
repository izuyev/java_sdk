package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_out_new_acct_plan_contracts_ReturnElement", propOrder = {"a2OutContractNo", "a2OutContractPlanNo"})
public class A2OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "a2_out_contract_no")
    protected Long a2OutContractNo;
    @XmlElement(name = "a2_out_contract_plan_no")
    protected Long a2OutContractPlanNo;
    
    public Long getA2OutContractNo() {
        return a2OutContractNo;
    }

    public void setA2OutContractNo(Long value) {
        this.a2OutContractNo = value;
    }

    public Long getA2OutContractPlanNo() {
        return a2OutContractPlanNo;
    }

    public void setA2OutContractPlanNo(Long value) {
        this.a2OutContractPlanNo = value;
    }

    
}
