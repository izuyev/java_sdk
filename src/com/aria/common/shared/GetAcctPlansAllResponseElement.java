package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "allAcctPlans"})
@XmlRootElement(name = "get_acct_plans_allResponseElement")
public class GetAcctPlansAllResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "all_acct_plans")
    protected List<AllAcctPlansReturnElement> allAcctPlans;
    
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

    public List<AllAcctPlansReturnElement> getAllAcctPlans() {
        if (this.allAcctPlans == null) {
            this.allAcctPlans = new ArrayList<AllAcctPlansReturnElement>();
        }
        return this.allAcctPlans;
    }
}
