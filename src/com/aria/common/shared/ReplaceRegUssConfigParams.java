package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "setName",    "inRegUssConfigParams"})
@XmlRootElement(name = "replace_reg_uss_config_params")
public class ReplaceRegUssConfigParams {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "set_name")
    protected String setName;
        @XmlElement(name = "in_reg_uss_config_params")
    protected InRegUssConfigParamsArray inRegUssConfigParams;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String value) {
        this.setName = value;
    }
            public InRegUssConfigParamsArray getInRegUssConfigParams() {
        return inRegUssConfigParams;
    }

    public void setInRegUssConfigParams(InRegUssConfigParamsArray value) {
        this.inRegUssConfigParams = value;
    }
            
}
