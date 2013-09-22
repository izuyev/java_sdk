package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a2_third_party_errors_ReturnElement", propOrder = {"errorClass", "errorCode", "errorMsg"})
public class A2ThirdPartyErrorsReturnElement {

    @XmlElement(name = "error_class")
    protected String errorClass;
    @XmlElement(name = "error_code")
    protected String errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public String getErrorClass() {
        return errorClass;
    }

    public void setErrorClass(String value) {
        this.errorClass = value;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    
}
