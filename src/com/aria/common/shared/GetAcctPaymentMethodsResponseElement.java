package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"acctPayMethods", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_acct_payment_methodsResponseElement")
public class GetAcctPaymentMethodsResponseElement {

    @XmlElement(name = "acct_pay_methods")
    protected List<AcctPayMethodsReturnElement> acctPayMethods;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<AcctPayMethodsReturnElement> getAcctPayMethods() {
        if (this.acctPayMethods == null) {
            this.acctPayMethods = new ArrayList<AcctPayMethodsReturnElement>();
        }
        return this.acctPayMethods;
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
