package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"allAcctSurcharges", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_surchargesResponseElement")
public class GetAcctSurchargesResponseElement {

    @XmlElement(name = "all_acct_surcharges")
    protected List<AllAcctSurchargesReturnElement> allAcctSurcharges;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AllAcctSurchargesReturnElement> getAllAcctSurcharges() {
        if (this.allAcctSurcharges == null) {
            this.allAcctSurcharges = new ArrayList<AllAcctSurchargesReturnElement>();
        }
        return this.allAcctSurcharges;
    }public Long getErrorCode() {
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

    
}
