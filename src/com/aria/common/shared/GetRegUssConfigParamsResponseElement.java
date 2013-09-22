package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"outRegUssConfigParams", "errorCode", "errorMsg"})
@XmlRootElement(name = "get_reg_uss_config_paramsResponseElement")
public class GetRegUssConfigParamsResponseElement {

    @XmlElement(name = "out_reg_uss_config_params")
    protected List<OutRegUssConfigParamsReturnElement> outRegUssConfigParams;
    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    
    public List<OutRegUssConfigParamsReturnElement> getOutRegUssConfigParams() {
        if (this.outRegUssConfigParams == null) {
            this.outRegUssConfigParams = new ArrayList<OutRegUssConfigParamsReturnElement>();
        }
        return this.outRegUssConfigParams;
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
