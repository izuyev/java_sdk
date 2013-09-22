package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "suppPlanHist"})
@XmlRootElement(name = "get_acct_supp_plan_historyResponseElement")
public class GetAcctSuppPlanHistoryResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "supp_plan_hist")
    protected List<SuppPlanHistReturnElement> suppPlanHist;
    
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

    public List<SuppPlanHistReturnElement> getSuppPlanHist() {
        if (this.suppPlanHist == null) {
            this.suppPlanHist = new ArrayList<SuppPlanHistReturnElement>();
        }
        return this.suppPlanHist;
    }
}
