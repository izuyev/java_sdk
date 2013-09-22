package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"webValsOut", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_web_replacement_valsResponseElement")
public class GetWebReplacementValsResponseElement {

    @XmlElement(name = "web_vals_out")
    protected List<WebValsOutReturnElement> webValsOut;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<WebValsOutReturnElement> getWebValsOut() {
        if (this.webValsOut == null) {
            this.webValsOut = new ArrayList<WebValsOutReturnElement>();
        }
        return this.webValsOut;
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
