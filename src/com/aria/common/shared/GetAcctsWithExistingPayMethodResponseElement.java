package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "acctsWithPayMethod"})
@XmlRootElement(name = "get_accts_with_existing_pay_methodResponseElement")
public class GetAcctsWithExistingPayMethodResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "accts_with_pay_method")
    protected List<AcctsWithPayMethodReturnElement> acctsWithPayMethod;
    
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

    public List<AcctsWithPayMethodReturnElement> getAcctsWithPayMethod() {
        if (this.acctsWithPayMethod == null) {
            this.acctsWithPayMethod = new ArrayList<AcctsWithPayMethodReturnElement>();
        }
        return this.acctsWithPayMethod;
    }
}
