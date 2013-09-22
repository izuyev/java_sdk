package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "suppFieldValues"})
@XmlRootElement(name = "get_supp_field_valuesResponseElement")
public class GetSuppFieldValuesResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "supp_field_values")
    protected List<SuppFieldValuesReturnElement> suppFieldValues;
    
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

    public List<SuppFieldValuesReturnElement> getSuppFieldValues() {
        if (this.suppFieldValues == null) {
            this.suppFieldValues = new ArrayList<SuppFieldValuesReturnElement>();
        }
        return this.suppFieldValues;
    }
}
