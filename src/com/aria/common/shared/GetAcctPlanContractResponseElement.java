package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctPlanContract"})
@XmlRootElement(name = "get_acct_plan_contractResponseElement")
public class GetAcctPlanContractResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "acct_plan_contract")
    protected List<AcctPlanContractReturnElement> acctPlanContract;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<AcctPlanContractReturnElement> getAcctPlanContract() {
        if (this.acctPlanContract == null) {
            this.acctPlanContract = new ArrayList<AcctPlanContractReturnElement>();
        }
        return this.acctPlanContract;
    }
}
