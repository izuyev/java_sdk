package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a5_out_new_acct_plan_contracts_ReturnElement", propOrder = {"a5OutContractNo", "a5OutContractPlanNo"})
public class A5OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "a5_out_contract_no")
    protected Long a5OutContractNo;
    @XmlElement(name = "a5_out_contract_plan_no")
    protected Long a5OutContractPlanNo;
    
    public Long getA5OutContractNo() {
        return a5OutContractNo;
    }

    public void setA5OutContractNo(Long value) {
        this.a5OutContractNo = value;
    }

    public Long getA5OutContractPlanNo() {
        return a5OutContractPlanNo;
    }

    public void setA5OutContractPlanNo(Long value) {
        this.a5OutContractPlanNo = value;
    }

    
}
